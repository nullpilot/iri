package com.iota.iri.service.dto;

import java.nio.ByteBuffer;

public class BinaryResponse extends AbstractResponse {
    private ByteBuffer [] buffers;
    private int size;
    private int offset = 0;

    public static BinaryResponse create(ByteBuffer [] buffers, int size) {
        BinaryResponse binaryResponse = new BinaryResponse();
        binaryResponse.buffers = buffers;
        binaryResponse.size = size;
        return binaryResponse;
    }

    public ByteBuffer getCurrentBuffer() {
      if(offset < buffers.length) {
        return buffers[offset];
      } else {
        return null;
      }
    }

    public ByteBuffer [] getBuffers() {
        return buffers;
    }

    public int getSize() {
      return size;
    }

    public void incrementOffset() {
      offset++;
    }

    public int getOffset() {
      return offset;
    }
}
