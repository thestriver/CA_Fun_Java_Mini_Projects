<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="1671.6">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; font: 12.0px Helvetica; min-height: 14.0px}
    span.Apple-tab-span {white-space:pre}
  </style>
</head>
<body>
<p class="p1">public class Order {</p>
<p class="p1"><span class="Apple-converted-space">  </span>boolean isFilled;</p>
<p class="p1"><span class="Apple-converted-space">  </span>double billAmount;</p>
<p class="p1"><span class="Apple-converted-space">  </span>String shipping;</p>
<p class="p2"><span class="Apple-converted-space">  </span></p>
<p class="p1"><span class="Apple-converted-space">  </span>public Order(boolean filled, double cost, String shippingMethod) {</p>
<p class="p1"><span class="Apple-tab-span">	</span><span class="Apple-tab-span">	</span>if (cost &gt; 24.00) {</p>
<p class="p1"><span class="Apple-converted-space">      </span>System.out.println("High value item!");</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p1"><span class="Apple-converted-space">    </span>isFilled = filled;</p>
<p class="p1"><span class="Apple-converted-space">    </span>billAmount = cost;</p>
<p class="p1"><span class="Apple-converted-space">    </span>shipping = shippingMethod;</p>
<p class="p1"><span class="Apple-converted-space">  </span>}</p>
<p class="p2"><span class="Apple-converted-space">  </span></p>
<p class="p1"><span class="Apple-converted-space">  </span>public void ship() {</p>
<p class="p1"><span class="Apple-converted-space">    </span>if (isFilled) {</p>
<p class="p1"><span class="Apple-converted-space">      </span>System.out.println("Shipping");</p>
<p class="p1"><span class="Apple-converted-space">      </span>System.out.println("Shipping cost: " + calculateShipping());</p>
<p class="p1"><span class="Apple-converted-space">    </span>} else {</p>
<p class="p1"><span class="Apple-converted-space">      </span>System.out.println("Order not ready");</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p1"><span class="Apple-converted-space">  </span>}</p>
<p class="p2"><span class="Apple-converted-space">  </span></p>
<p class="p1"><span class="Apple-converted-space">  </span>public double calculateShipping() {</p>
<p class="p1">/ declare conditional statement here</p>
<p class="p1"><span class="Apple-converted-space">    </span>if (shipping == "Regular") {</p>
<p class="p1"><span class="Apple-converted-space">      </span>return 0;</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p1"><span class="Apple-converted-space">    </span>else if (shipping == "Express") {</p>
<p class="p1"><span class="Apple-converted-space">      </span>return 1.75;</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p1"><span class="Apple-converted-space">    </span>else {</p>
<p class="p1"><span class="Apple-converted-space">      </span>return 0.50;</p>
<p class="p1"><span class="Apple-converted-space">    </span>}</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space"> <span class="Apple-tab-span">	</span></span>}</p>
<p class="p2"><span class="Apple-converted-space">  </span></p>
<p class="p1"><span class="Apple-converted-space">  </span>public static void main(String[] args) {</p>
<p class="p1"><span class="Apple-converted-space">    </span>// do not alter the main method!</p>
<p class="p1"><span class="Apple-converted-space">    </span>Order book = new Order(true, 9.99, "Express");</p>
<p class="p1"><span class="Apple-converted-space">    </span>Order chemistrySet = new Order(false, 72.50, "Regular");</p>
<p class="p2"><span class="Apple-converted-space">    </span></p>
<p class="p1"><span class="Apple-converted-space">    </span>book.ship();</p>
<p class="p1"><span class="Apple-converted-space">    </span>chemistrySet.ship();</p>
<p class="p1"><span class="Apple-converted-space">  </span>}</p>
<p class="p1">}</p>
</body>
</html>
