package edu.cmu.cs.mvelezce.zip.featureHouse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface FeatureSwitchID {
    int id();

    String thenFeature();

    String elseFeature();
}