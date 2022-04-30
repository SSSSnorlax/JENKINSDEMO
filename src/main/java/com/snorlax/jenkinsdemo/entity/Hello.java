package com.snorlax.jenkinsdemo.entity;

/**
 * @Author: Snorlax
 * @Date: 2022/4/30 22:46
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class Hello {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Hello(String word) {
        this.word = word;
    }
}
