package it.sevenbits.homework.tokens;

public interface IToken {
    String getName();
    String getLexeme();
    void append(char symbol);
}
