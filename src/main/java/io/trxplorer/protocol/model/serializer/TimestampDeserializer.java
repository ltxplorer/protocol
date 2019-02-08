package io.trxplorer.protocol.model.serializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class TimestampDeserializer extends JsonDeserializer<Long>{

	@Override
	public Long deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date;
		try {
			date = sdf.parse(p.getText());
			long millis = date.getTime();
			return millis;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return 0l;
	}

}
