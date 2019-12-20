package com.example.acrepairpreview.di;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Qualifier;

/**
 * Annotation created to improve Context injection. This annotation is used with @Inject for
 * Context class to return the current Activity context.
 * <p>
 * This annotation can be replaced with a @Named annotation, but configure before the
 * ActivityModule.
 *
 * @author Jaypatelbond
 */

@Qualifier
@Retention(RUNTIME)
@interface ActivityContext {

}
