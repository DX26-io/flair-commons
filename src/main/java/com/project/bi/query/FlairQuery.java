package com.project.bi.query;


import lombok.Data;

@Data
public class FlairQuery {

    /**
     * Query statement
     */
    private String statement;

    private boolean pullMeta;

    private String source;
}
