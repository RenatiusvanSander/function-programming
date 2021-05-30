package edu.remad.functionalprogramming.functionalprogramming.usingfunctions.exercise02_01;

/**
 * Polymorphic functional interface
 */
public interface Function <T, U>{

  U apply(T arg);
}
