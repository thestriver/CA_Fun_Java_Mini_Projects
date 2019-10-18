public class Order {
boolean isFilled;
double billAmount;
String shipping;
public Order(boolean filled, double cost, String shippingMethod) {
if (cost == 24.00) {
  System.out.println("High value item!");


}
isFilled = filled;
billAmount = cost;
shipping = shippingMethod;

}

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
