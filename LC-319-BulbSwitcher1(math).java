class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
// 1) only perfect squares position are ON
// 2) why?
// ->they only have odd factors: 3x3 >> 9(but 3 is same so considered only once)
// ->another number in the factor pair is absent to turn the bulb off
// ---> one pair(a,b) factor: a-ON, b-OFF
// 3) so only the perfect sq pos are on thus count the number of perfecct sq in the number(n)
// eg: for 3 bulbs
// r1: 1 1 1
// r2: 1 0 1
// r3: 1 0 0
// |PS pos|
//   ON
