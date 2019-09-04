package org.springframework.tgz;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @author: GordenTam
 * @create: 2019-08-19
 **/

public class TestCondition implements Condition {
    public boolean matches(ConditionContext var1, AnnotatedTypeMetadata var2){
        return true;
    }
}
