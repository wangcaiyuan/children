package com.lianwu.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CommentResult<T> implements Serializable {

    private Integer code;

    public CommentResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private String message;

    private T data;

    private CommentResult(int code, String message){
        this(code, message, null);
    }

}
