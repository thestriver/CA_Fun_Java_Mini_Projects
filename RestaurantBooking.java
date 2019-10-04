<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta http-equiv="Content-Style-Type" content="text/css">
  <title></title>
  <meta name="Generator" content="Cocoa HTML Writer">
  <meta name="CocoaVersion" content="1671.6">
  <style type="text/css">
    p.p1 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 14.0px; font: 12.0px Helvetica; color: #000000; -webkit-text-stroke: #000000}
    p.p2 {margin: 0.0px 0.0px 0.0px 0.0px; line-height: 14.0px; font: 12.0px Helvetica; color: #000000; -webkit-text-stroke: #000000; min-height: 12.0px}
    span.s1 {font-kerning: none}
    span.Apple-tab-span {white-space:pre}
  </style>
</head>
<body>
<p class="p1"><span class="s1">public class Reservation {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>int guestCount;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>int restaurantCapacity;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>boolean isRestaurantOpen;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>boolean isConfirmed;</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">  </span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>public Reservation(int count, int capacity, boolean open) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>if (count &lt; 1 || count &gt; 8) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>System.out.println("Invalid reservation!");</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>}</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>guestCount = count;</span></p>
<p class="p1"><span class="s1"><span class="Apple-tab-span">	</span><span class="Apple-tab-span">	</span>restaurantCapacity = capacity;</span></p>
<p class="p1"><span class="s1"><span class="Apple-tab-span">	</span><span class="Apple-tab-span">	</span>isRestaurantOpen = open;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>} <span class="Apple-converted-space"> </span></span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">  </span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>public void confirmReservation() {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>if (restaurantCapacity &gt;= guestCount &amp;&amp; isRestaurantOpen) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>System.out.println("Reservation confirmed");</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>isConfirmed = true;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>} else {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>System.out.println("Reservation denied");</span></p>
<p class="p1"><span class="s1"><span class="Apple-tab-span">	</span><span class="Apple-tab-span">	</span><span class="Apple-tab-span">	</span>isConfirmed = false;</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>}</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>}</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">  </span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>public void informUser() {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>// Write conditional here</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>if (!isConfirmed) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>System.out.println("Unable to confirm reservation, please contact restaurant.");</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>}</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>else {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">      </span>System.out.println("Please enjoy your meal!");</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>}</span></p>
<p class="p1"><span class="s1"><br>
</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>}</span></p>
<p class="p2"><span class="s1"><span class="Apple-converted-space">  </span></span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>public static void main(String[] args) {</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>Reservation partyOfThree = new Reservation(3, 12, true);</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>Reservation partyOfFour = new Reservation(4, 3, true);</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>partyOfThree.confirmReservation();</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>partyOfThree.informUser();</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>partyOfFour.confirmReservation();</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">    </span>partyOfFour.informUser();</span></p>
<p class="p1"><span class="s1"><span class="Apple-converted-space">  </span>}</span></p>
<p class="p1"><span class="s1">}</span></p>
</body>
</html>
