package test;

import main.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void nullReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void noBracketReturnsTrue() {
        Assert.assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unequalBracketsInWrongOrderReturnsFalse() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("]]["));
    }

    @Test
    public void unequalBracketsInWrongOrderReturnsFalseReversed() {
        Assert.assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
}
