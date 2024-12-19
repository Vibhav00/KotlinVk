package com.vk.kotlinvk.ktln.basics

fun main(){
    // nullable  variable
    val k:Data? = Data()

     /**
      *  breakdown
      *  k?.a  return a if k is not null
      *  k?.a?:45 if(k?.a) is not null return it otherwise return 45
      *
      * **/
    val p = k?.a?:45
    // val s = k?.a.apply {  }?:Unit.apply {  }

    // do something when k is null and something if it is not null
    val s = k?.a.apply {  }?:run{}

    println(p)

}
// primary constructor can take values and even can add the properties to the class ...
// Amazing in this case properties  a and b will be created
// i had written a blog on it check it out at ----
data class Data(val a:Int = 485 ,val b:Int = 45)

 /**
  *
  *
  *   // we got this much in just single line of code ( extra features of data class like toString(),componentN(),getters and setters )
  *   public final class Data {
  *    private final int a;
  *    private final int b;
  *
  *    public Data(int a, int b) {
  *       this.a = a;
  *       this.b = b;
  *    }
  *
  *    // $FF: synthetic method
  *    public Data(int var1, int var2, int var3, DefaultConstructorMarker var4) {
  *       if ((var3 & 1) != 0) {
  *          var1 = 45;
  *       }
  *
  *       if ((var3 & 2) != 0) {
  *          var2 = 45;
  *       }
  *
  *       this(var1, var2);
  *    }
  *
  *    public final int getA() {
  *       return this.a;
  *    }
  *
  *    public final int getB() {
  *       return this.b;
  *    }
  *
  *    public final int component1() {
  *       return this.a;
  *    }
  *
  *    public final int component2() {
  *       return this.b;
  *    }
  *
  *    @NotNull
  *    public final Data copy(int a, int b) {
  *       return new Data(a, b);
  *    }
  *
  *    // $FF: synthetic method
  *    public static Data copy$default(Data var0, int var1, int var2, int var3, Object var4) {
  *       if ((var3 & 1) != 0) {
  *          var1 = var0.a;
  *       }
  *
  *       if ((var3 & 2) != 0) {
  *          var2 = var0.b;
  *       }
  *
  *       return var0.copy(var1, var2);
  *    }
  *
  *    @NotNull
  *    public String toString() {
  *       return "Data(a=" + this.a + ", b=" + this.b + ')';
  *    }
  *
  *    public int hashCode() {
  *       int result = Integer.hashCode(this.a);
  *       result = result * 31 + Integer.hashCode(this.b);
  *       return result;
  *    }
  *
  *    public boolean equals(@Nullable Object other) {
  *       if (this == other) {
  *          return true;
  *       } else if (!(other instanceof Data)) {
  *          return false;
  *       } else {
  *          Data var2 = (Data)other;
  *          if (this.a != var2.a) {
  *             return false;
  *          } else {
  *             return this.b == var2.b;
  *          }
  *       }
  *    }
  *
  *    public Data() {
  *       this(0, 0, 3, (DefaultConstructorMarker)null);
  *    }
  * }
  *
  *
  *
  *
  *
  *
  *
  *
  *
  *
  *
  * **/

