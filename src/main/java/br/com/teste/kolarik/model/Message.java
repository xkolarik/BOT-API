package br.com.teste.kolarik.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.BSONTimestamp;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	private ObjectId id;
	private BSONTimestamp timestamp;
	private ObjectId from;
	private ObjectId to;
	private String text;
	private ObjectId conversarionId;

}
