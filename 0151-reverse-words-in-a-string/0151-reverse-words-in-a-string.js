/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    var reversstr=s.split(" ")
    .filter(str => str).reverse().join(" ");
    return reversstr;
    
};