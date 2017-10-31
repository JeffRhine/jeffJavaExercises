function sumDouble(x,y) {
    if(x===y){
        return 2*(x+y);
    }else{
        return x+y;
    }
}
 function hasTeen(a,b,c){
     if((a>12 && a<20)||(b>12 && b<20)||(c>12 && c<20)){
         return true;
     }return false;
 }
 function lastDigit(d,e){
     if(d%10===e%10){
         return true;
     }return false
 }
 function seeColor(str){
if(str.substring(0,3)==="red"){
    return "red";
}if(str.substring(0,4)==="blue"){
    return "blue";
}else{
    return "";
}
 }
 function middleThree(stg){
var l=(stg.length/2)-1;
var lg=l+3;
return stg.substring(l,lg);
 }
 function frontAgain(st){
     if(st.substring(0,2)===st.substring(st.length-2,st.length)){
         return true;
     }return false;
 }
 function alarmClock(day,vacation){
    
     if(day>0&&day<6&&!vacation){
return "7:00";
     }if((day<1||day>5)&&!vacation){
         return  "10:00";
     }     if((day>0&&day<6)&&vacation){
        return  "10:00";
     }
    if((day<1||day>5)&&vacation){
        return  "off";
     }
 }
 function makeMiddle(nums){
     if(nums.length%2!=0||nums.length<2){
     return [];
     }
     var nums2= new Array;
     nums2[0] =nums[(nums.length/2)-1];
    nums2[1]=nums[(nums.length/2)];
    return nums2;
 }
 function oddOnly(nums3){
    var newNum = new Array;
     for(i=0;nums3.length>i;i++){
         if(nums3[i]%2===1){
         newNum.push(nums3[i]);
         }
     }return newNum;
 }
 function weave(ar,ar2){
    var newAr= new Array;
     if(ar.length>ar2.length){
         for(x=0;ar.length>x;x++){
             if(ar[x]!=undefined){
            newAr.push(ar[x]);
             }if(ar2[x]!=undefined){
            newAr.push(ar2[x]);
            }
         }return newAr;
     }else{
        for(x=0;ar2.length>x;x++){
            if(ar[x]!=undefined){
                newAr.push(ar[x]);
                 }
            if(ar2[x]!=undefined){
                newAr.push(ar2[x]);
                }
            
         }return newAr;
     }

 }
 function cigarParty(cigar,party){
     if((cigar>39&&cigar<61&&!party)||(cigar>39&&party)){
         return true;
     }return false;
 }
 function stringSplosion(code){
     var stng ="";
     for(x=1;code.length>=x;x++){
         stng+=(code.substring(0,x));
     }return stng;
 }
 function fizzBuzz(num){
     if(num%15===0){
         return "FizzBuzz";
     }if(num%5===0){
         return "Buzz";
     }if(num%3===0){
         return "Fizz";
     }else{
         return num;
     }
 }
function countValues(nums4){
var count={};
for(x=0;nums4.length>x;x++){
    if(count[nums4[x]]===undefined){
        count[nums4[x]]=0;
    }
    count[nums4[x]]++;
}return count;
}

function reverseArray(nums5){
   return nums5.reverse();
}
function blackJack(j,k){
    if(j>k&&j<22){
        return j;
    }if(k>j&&k<22){
        return k;
    }else{
        return 0;
    }
}