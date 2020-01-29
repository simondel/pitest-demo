package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemovedCallBugTest {

    @Test
    public void test() throws InterruptedException {
       assertTrue(new RemovedCallBug().doSomething());
    }

    @Test
    public void execute_withSmallTestCommand_returnsTrue() throws InterruptedException {
       assertTrue(new RemovedCallBug().canExecuteEverything("test command"));
    }

    // Uncomment the tests below to achieve 100% mutation score!

    // @Test
    // public void execute_withTestCommandOfLength25_returnsFalse() throws InterruptedException {
    //    assertFalse(new RemovedCallBug().canExecuteEverything("test commandcommandcomman"));
    // }

    // @Test
    // public void execute_withEmptyCommand_returnsFalse() throws InterruptedException {
    //    assertFalse(new RemovedCallBug().canExecuteEverything(""));
    // }

    // @Test
    // public void execute_withUnknownCommand_returnsTrue() throws InterruptedException {
    //    assertTrue(new RemovedCallBug().canExecuteEverything("this is unknown"));
    // }
}
