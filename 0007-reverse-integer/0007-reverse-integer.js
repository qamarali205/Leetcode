/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let absVal = Math.abs(x).toString();
        absVal = absVal.split("").reverse().join("");

    return x > 0 ? (absVal < Math.pow(2,31) - 1 ? absVal : 0) : 
                   (-absVal > -Math.pow(2,31) ? -absVal : 0);
    
};