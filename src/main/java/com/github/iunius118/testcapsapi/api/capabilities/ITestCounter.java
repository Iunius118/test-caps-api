package com.github.iunius118.testcapsapi.api.capabilities;

import net.minecraftforge.common.capabilities.AutoRegisterCapability;

/**
 * A test capability that counts a number.
 */
@AutoRegisterCapability
public interface ITestCounter {
    /**
     * Increase the counter value by 1.
     */
    void increase();

    /**
     * Increase the counter value by a given amount.
     * @param amount Amount of increase.
     */
    void increase(int amount);

    /**
     * Decrease the counter value by 1.
     */
    void decrease();

    /**
     * Decrease the counter value by a given amount.
     * @param amount Amount of decrease.
     */
    void decrease(int amount);

    /**
     * Set the counter value to a given number.
     * @param number Number to set for the counter.
     */
    void set(int number);

    /**
     * Get the counter value.
     * @return Value held by the counter.
     */
    int get();
}
