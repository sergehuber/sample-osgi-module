package org.jahia.modules.sample.osgi;

/**
 * An example of a Felix shell command
 */
public class ShellCommands {

    public String hello(String name) {
        String message = "Hello " + name;
        return message;
    }

}
