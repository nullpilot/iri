package com.iota.iri.service.dto;

public class BinaryResponse extends AbstractResponse {
    private byte [] bytes;

    public static BinaryResponse create(byte [] bytes) {
        BinaryResponse binaryResponse = new BinaryResponse();
        binaryResponse.bytes = bytes;
        return binaryResponse;
    }

    public byte [] getBytes() {
        return bytes;
    }
}
