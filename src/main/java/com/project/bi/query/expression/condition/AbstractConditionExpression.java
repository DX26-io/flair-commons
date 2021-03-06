package com.project.bi.query.expression.condition;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@ToString
public abstract class AbstractConditionExpression implements ConditionExpression,
        Serializable {

    protected String uuid;

    protected Map<String, Object> metadata;

    /**
     * Get identifier expression
     *
     * @return identifier in string representation
     */
    @Override
    public String getIdentifier() {
        return uuid;
    }
}
