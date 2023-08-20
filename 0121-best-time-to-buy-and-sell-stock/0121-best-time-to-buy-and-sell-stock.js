/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
   let minimumStockPrice=prices[0]||0;
   let profit=0;
   for(let i=0; i<prices.length; i++){
       if(prices[i]<minimumStockPrice){
           minimumStockPrice=prices[i];
       }
       profit=Math.max(profit,prices[i]-minimumStockPrice);
   }
   return profit;
    
};