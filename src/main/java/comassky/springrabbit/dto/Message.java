package comassky.springrabbit.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;

public class Message {

	private String message;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime dateEcriture;

	public Message() {
	}

	public Message(final String message, final LocalDateTime dateEcriture) {
		this.message = message;
		this.dateEcriture = dateEcriture;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDateEcriture() {
		return dateEcriture;
	}

	public void setDateEcriture(LocalDateTime dateEcriture) {
		this.dateEcriture = dateEcriture;
	}

	@Override
	public String toString() {
		return "Message{" +
				"message='" + message + '\'' +
				", dateEcriture=" + dateEcriture.toString() +
				'}';
	}
}
