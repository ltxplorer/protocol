package io.trxplorer.protocol.model.serializer;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import io.trxplorer.protocol.model.contract.FrozenSupply;

public class FrozenSupplySerializer extends JsonSerializer<List<FrozenSupply>>{



	@Override
	public void serialize(List<FrozenSupply> value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		System.out.println("serializer ===>"+value);
	    jgen.writeStartObject();
        jgen.writeObject(value);
        jgen.writeEndObject();
		
	}


}
