diff --git a/Crux_Live_Jan22/.classpath b/Crux_Live_Jan22/.classpath
new file mode 100644
index 0000000..57bca72
--- /dev/null
+++ b/Crux_Live_Jan22/.classpath
@@ -0,0 +1,10 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<classpath>
+	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-17">
+		<attributes>
+			<attribute name="module" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="src" path="src"/>
+	<classpathentry kind="output" path="bin"/>
+</classpath>
diff --git a/Crux_Live_Jan22/.gitignore b/Crux_Live_Jan22/.gitignore
new file mode 100644
index 0000000..ae3c172
--- /dev/null
+++ b/Crux_Live_Jan22/.gitignore
@@ -0,0 +1 @@
+/bin/
diff --git a/Crux_Live_Jan22/.project b/Crux_Live_Jan22/.project
new file mode 100644
index 0000000..1fe0f13
--- /dev/null
+++ b/Crux_Live_Jan22/.project
@@ -0,0 +1,17 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<projectDescription>
+	<name>Crux_Live_Jan22</name>
+	<comment></comment>
+	<projects>
+	</projects>
+	<buildSpec>
+		<buildCommand>
+			<name>org.eclipse.jdt.core.javabuilder</name>
+			<arguments>
+			</arguments>
+		</buildCommand>
+	</buildSpec>
+	<natures>
+		<nature>org.eclipse.jdt.core.javanature</nature>
+	</natures>
+</projectDescription>
diff --git a/Crux_Live_Jan22/.settings/org.eclipse.jdt.core.prefs b/Crux_Live_Jan22/.settings/org.eclipse.jdt.core.prefs
new file mode 100644
index 0000000..8c9943d
--- /dev/null
+++ b/Crux_Live_Jan22/.settings/org.eclipse.jdt.core.prefs
@@ -0,0 +1,14 @@
+eclipse.preferences.version=1
+org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
+org.eclipse.jdt.core.compiler.codegen.targetPlatform=17
+org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
+org.eclipse.jdt.core.compiler.compliance=17
+org.eclipse.jdt.core.compiler.debug.lineNumber=generate
+org.eclipse.jdt.core.compiler.debug.localVariable=generate
+org.eclipse.jdt.core.compiler.debug.sourceFile=generate
+org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
+org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
+org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
+org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=warning
+org.eclipse.jdt.core.compiler.release=enabled
+org.eclipse.jdt.core.compiler.source=17
diff --git a/Crux_Live_Jan22/src/Alexa_goes_Shopping.java b/Crux_Live_Jan22/src/Alexa_goes_Shopping.java
new file mode 100644
index 0000000..8e1b604
--- /dev/null
+++ b/Crux_Live_Jan22/src/Alexa_goes_Shopping.java
@@ -0,0 +1,48 @@
+import java.util.Scanner;
+
+public class Alexa_goes_Shopping {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated meSthod stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] price = new int[n];
+		for(int i=0;i<price.length;i++)
+		{
+			price[i]=sc.nextInt();
+		}
+		int q=sc.nextInt();
+		while(q-->0)
+		{
+			int A=sc.nextInt();
+			int K = sc.nextInt();
+		
+     if(istrue(price,A,K)==true)
+{
+	System.out.println("Yes");
+}
+     else
+     {
+    	 System.out.println("No");
+     }
+	}}
+public static boolean istrue(int[]price,int A,int K)
+{
+	int count=0;
+	for(int i=0;i<price.length;i++)
+	{
+		if(A%price[i]==0)
+		{
+			count++;
+		}
+	}
+	if (count>=K)
+			{
+		return true;
+			}
+	else
+	{
+		return false;
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class3/Maximum_Circular_Sum.java b/Crux_Live_Jan22/src/Doubt_class3/Maximum_Circular_Sum.java
new file mode 100644
index 0000000..953d096
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class3/Maximum_Circular_Sum.java
@@ -0,0 +1,51 @@
+package Doubt_class3;
+
+import java.util.Scanner;
+
+public class Maximum_Circular_Sum {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			int n = sc.nextInt();
+			int[] arr = new int[n];
+			for(int i=0;i<arr.length;i++)
+			{
+				arr[i]=sc.nextInt();
+			}
+			System.out.println(maximumsum(arr));
+	}
+		
+	}
+	public static int maximumsum(int[]arr)
+	{	
+		int linear_kadane=kadane(arr);
+		int sum =0;
+		for(int i=0;i<arr.length;i++ )
+		{
+			sum = sum+arr[i];
+			arr[i]=arr[i]*-1;
+		}
+		int inverted_kadane = kadane(arr);
+		int cirl_kadane = inverted_kadane+sum;
+		return Math.max(linear_kadane, cirl_kadane);
+	}
+	public static int kadane(int[]arr)
+	{
+		int ans = Integer.MIN_VALUE;
+		int prevsum=0;
+		for(int i=0;i<arr.length;i++)
+		{
+		prevsum +=arr[i];
+			ans = Math.max(ans, prevsum);
+			if(prevsum<0) {
+				prevsum=0;
+			}
+		}
+		return ans;
+	}
+	
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class3/Maximum_sum_path_of_two_array.java b/Crux_Live_Jan22/src/Doubt_class3/Maximum_sum_path_of_two_array.java
new file mode 100644
index 0000000..397673c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class3/Maximum_sum_path_of_two_array.java
@@ -0,0 +1,81 @@
+package Doubt_class3;
+
+import java.util.Scanner;
+
+public class Maximum_sum_path_of_two_array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			int n = sc.nextInt();
+			int m = sc.nextInt();
+			int[]arr = new int[n];
+			int[]brr = new int[m];
+			for(int i=0;i<arr.length;i++)
+			{
+				arr[i]=sc.nextInt();
+			}
+			for(int i=0;i<arr.length;i++)
+			{
+				brr[i]=sc.nextInt();
+			}
+			System.out.println(pathsum(arr,brr));
+		}
+	}
+public static int pathsum(int[]arr,int[]brr)
+{
+	int i=0;//jaha se initialize hoga arr
+	int j=0;//jaha se initialize hoga brr
+	int p=0;//arr start
+	int q=0;//brr start
+	int ans = 0;
+	while(i<arr.length&&j<brr.length)
+	{
+		if(arr[i]<brr[j])
+		{
+			i++;
+		}
+		else if(arr[i]>brr[j])
+		{
+			j++;
+		}
+		else
+		{
+			int sum1=0;
+			int sum2=0;
+			for(int k=p;k<=i;k++)
+			{
+				sum1=sum1+arr[k];
+			}
+			for(int k=q;k<=j;k++)
+			{
+				sum2 +=brr[k];
+			}
+			 ans = ans + Math.max(sum1,sum2);
+			i++;
+			j++;
+			p=i;
+			q=j;
+			
+		}
+	}
+	if(i==arr.length)
+	{
+		for(int k=q;k<brr.length;k++)
+		{
+			ans = ans+brr[k];
+		}
+	}
+	if(j==brr.length)
+	{
+		for(int k=p;k<arr.length;k++)
+		{
+			ans = ans+arr[k];
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class3/Spiral_print_anticlockwise.java b/Crux_Live_Jan22/src/Doubt_class3/Spiral_print_anticlockwise.java
new file mode 100644
index 0000000..3bb8715
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class3/Spiral_print_anticlockwise.java
@@ -0,0 +1,58 @@
+package Doubt_class3;
+
+import java.util.Scanner;
+
+public class Spiral_print_anticlockwise {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int [][]arr = new int[n][m];
+		for(int i=0;i<n;i++)
+		{
+			for(int j=0;j<m;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+		 spiral(arr);
+		 System.out.println("END"); 
+	}
+public static void spiral(int[][]arr)	
+{
+int minr=0;
+int maxr = arr.length-1;
+int minc=0;
+int maxc = arr[0].length-1;
+int total=arr.length*arr[0].length;
+int count=0;
+while(count<total)
+{
+	for(int i=minr;i<=maxr && count<total;i++)
+	{
+		System.out.print(arr[i][minc]+", ");
+		count++;
+	}
+	minc++;
+	for(int i=minc;i<=maxc && count<total;i++)
+	{
+		System.out.print(arr[maxr][i]+", ");
+		count++;
+	}
+	maxr--;
+	for(int i=maxr;i>=minr && count<total;i--)
+	{
+		System.out.print(arr[i][maxc]+", ");
+		count++;
+	}
+	maxc--;
+	for(int i=maxc;i>=minc && count<total;i--)
+	{
+		System.out.print(arr[minr][i]+", ");
+		count++;
+	}
+	minr++;
+}
+}}
diff --git a/Crux_Live_Jan22/src/Doubt_class4/Kth_root.java b/Crux_Live_Jan22/src/Doubt_class4/Kth_root.java
new file mode 100644
index 0000000..6e551ab
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class4/Kth_root.java
@@ -0,0 +1,31 @@
+package Doubt_class4;
+
+import java.util.Scanner;
+
+public class Kth_root {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			long n = sc.nextLong();
+			int k = sc.nextInt();
+		}
+	
+	}
+public static int kthroot(long n,int k)
+{
+	long lo =1;
+	long hi = n;
+	long ans = 0;
+	while(lo<=hi)
+	{
+		long mid = lo+(hi-lo)/2;
+		if(Math.pow(mid, k)<=n)
+		ans = mid;
+		lo = mid+1;
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/Can_you_read_this.java b/Crux_Live_Jan22/src/Doubt_class5/Can_you_read_this.java
new file mode 100644
index 0000000..bdad819
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/Can_you_read_this.java
@@ -0,0 +1,32 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class Can_you_read_this {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		strng(str);
+	}
+public static void strng(String str)
+{
+	String ans ="";
+	ans = ans+str.charAt(0);
+	for(int i=1;i<str.length();i++)
+	{
+	   char ch = str.charAt(i);
+	   if(ch>='A'&&ch<='Z') {
+	   System.out.println(ans);
+	   ans="";
+	   ans = ans+ch;
+	   }
+	
+	   else
+	   {
+		   ans = ans+ch;
+	   }
+}
+	System.out.println(ans);
+}}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Doubt_class5/Stirngs_difference_in_ascii.java b/Crux_Live_Jan22/src/Doubt_class5/Stirngs_difference_in_ascii.java
new file mode 100644
index 0000000..707002e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/Stirngs_difference_in_ascii.java
@@ -0,0 +1,26 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class Stirngs_difference_in_ascii {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		Ascii_codes(str);
+	}
+public static void Ascii_codes(String str)
+{    
+	String ans="";
+	char prev = str.charAt(0);
+	for(int i=1;i<str.length();i++)
+	{
+		char curr = str.charAt(i);
+		ans = ans+prev+(curr-prev);
+		prev = curr;
+	}
+	ans = ans+prev;
+	System.out.println(ans);
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/String_String_compression.java b/Crux_Live_Jan22/src/Doubt_class5/String_String_compression.java
new file mode 100644
index 0000000..17a05bb
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/String_String_compression.java
@@ -0,0 +1,44 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class String_String_compression {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		// TODO Auto-generated method stub
+				Scanner sc = new Scanner(System.in);
+				String str = sc.next();
+				stringprint(str);
+						
+			}
+		public static void stringprint(String str)
+		{
+			char prev = str.charAt(0);
+			int count=1;
+			String ans = "";
+			for(int i=1;i<str.length();i++)
+			{
+				char curr  = str.charAt(i);
+				if(prev==curr)
+				{
+					count++;
+				}
+				else
+				{
+					ans = ans+prev;
+					if(count>1) {
+						ans = ans+count;}
+					prev = curr;
+					count=1;
+				
+			}
+			}
+			ans= ans+str.charAt(str.length()-1);
+			if(count>1){
+                ans = ans+count;}
+			System.out.println(ans);
+		}
+		}
+
diff --git a/Crux_Live_Jan22/src/Doubt_class5/String_compression.java b/Crux_Live_Jan22/src/Doubt_class5/String_compression.java
new file mode 100644
index 0000000..5d1d67d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/String_compression.java
@@ -0,0 +1,36 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class String_compression {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		stringprint(str);
+				
+	}
+public static void stringprint(String str)
+{
+	char prev = str.charAt(0);
+	int count=1;
+	String ans = "";
+	for(int i=1;i<str.length();i++)
+	{
+		char curr  = str.charAt(i);
+		if(prev==curr)
+		{
+			count++;
+		}
+		else
+		{
+			ans = ans+prev+count;
+			prev = curr;
+			count=1;
+		}
+	}
+	ans= ans+str.charAt(str.length()-1)+count;
+	System.out.println(ans);
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/Strings_Max_Frequency_Character.java b/Crux_Live_Jan22/src/Doubt_class5/Strings_Max_Frequency_Character.java
new file mode 100644
index 0000000..b6a45fa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/Strings_Max_Frequency_Character.java
@@ -0,0 +1,32 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class Strings_Max_Frequency_Character {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		Frequency_Character(str);
+	}
+public static void Frequency_Character(String str)
+{
+	int[]freq = new int[26];
+	for(int i=0;i<str.length();i++)
+	{
+		char ch = str.charAt(i);
+		freq[ch-97] = freq[ch-97]+1;
+	}
+	int max_index=0;
+	for(int i=0;i<freq.length;i++)
+	{
+		if(freq[i]>freq[max_index])
+		{
+			max_index=i;
+		}
+	}
+	char ch = (char)(97+max_index);
+	System.out.println(ch);
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/Strings_Odd_even_character.java b/Crux_Live_Jan22/src/Doubt_class5/Strings_Odd_even_character.java
new file mode 100644
index 0000000..3414190
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/Strings_Odd_even_character.java
@@ -0,0 +1,30 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class Strings_Odd_even_character {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		oddeven(str);
+	}
+public static void oddeven(String str)
+{
+	String ans ="";
+	for(int i=0;i<str.length();i++)
+	{
+		char ch = str.charAt(i);
+		if(i%2==0)
+		{
+			ans = ans+(char)(ch+1);
+		}
+		else
+		{
+			ans = ans+(char)(ch-1);
+		}
+	}
+	System.out.println(ans);
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/Toggle_case.java b/Crux_Live_Jan22/src/Doubt_class5/Toggle_case.java
new file mode 100644
index 0000000..19126a1
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/Toggle_case.java
@@ -0,0 +1,30 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class Toggle_case {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		toggle(str);
+	}
+public static void toggle(String str)
+{
+	String ans ="";
+	for(int i=0;i<str.length();i++)
+	{
+		char ch = str.charAt(i);
+		if(ch>='A'&& ch<='Z')
+		{
+			ans = ans + (char)(ch+32);
+		}
+		else
+		{
+			ans = ans+(char)(ch-32);
+		}
+	}
+	System.out.println(ans);
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/form_biggest_number.java b/Crux_Live_Jan22/src/Doubt_class5/form_biggest_number.java
new file mode 100644
index 0000000..c3d56b4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/form_biggest_number.java
@@ -0,0 +1,53 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class form_biggest_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			int n = sc.nextInt();
+			int[]arr = new int[n];
+			for(int i=0;i<arr.length;i++)
+			{
+				arr[i]=sc.nextInt();
+			}
+			sort(arr);
+			for(int i=0;i<arr.length;i++) {
+				System.out.print(arr[i]);
+			}
+			System.out.println();
+		}
+	}
+	public static void sort(int[] arr)
+	{
+		for(int pass = 1;pass<arr.length;pass++)
+		{
+			for(int i=0;i<arr.length-pass;i++)
+			{
+				if(compare(arr[i],arr[i+1])>0)
+				{
+					int temp = arr[i];
+					arr[i] = arr[i+1];
+					arr[i+1]=temp;
+				}
+			}
+		}
+		
+	}
+public static int compare(int x1,int x2)
+{
+	String s1 = ""+x1+x2;
+	String s2 = ""+x2+x1;
+	if(Long.parseLong(s2)>Long.parseLong(s1)) {
+		return 1;
+	}
+	else {
+		return -1;
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Doubt_class5/remove_duplicates.java b/Crux_Live_Jan22/src/Doubt_class5/remove_duplicates.java
new file mode 100644
index 0000000..01ae46c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Doubt_class5/remove_duplicates.java
@@ -0,0 +1,37 @@
+package Doubt_class5;
+
+import java.util.Scanner;
+
+public class remove_duplicates {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		duplicate(str);
+		
+	}
+public static void duplicate(String str)
+{
+	int count=1;
+	char prev = str.charAt(0);
+	String ans = "";
+	for(int i=1;i<str.length();i++)
+	{
+		char curr = str.charAt(i);
+		if(prev == curr)
+		{
+			count++;
+		}
+		else
+		{
+			ans = ans+prev;
+			prev = curr;
+			count=1;
+		}
+	}
+	ans = ans+str.charAt(str.length()-1);
+	System.out.println(ans);
+	
+}
+}
diff --git a/Crux_Live_Jan22/src/Inverse_array.java b/Crux_Live_Jan22/src/Inverse_array.java
new file mode 100644
index 0000000..b8a826d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Inverse_array.java
@@ -0,0 +1,31 @@
+import java.util.Scanner;
+
+public class Inverse_array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		  Scanner sc = new Scanner(System.in);
+	      int n = sc.nextInt();
+	      int[] arr = new int[n];
+	      for(int i =0;i<arr.length;i++)
+	      {
+	    	  arr[i]=sc.nextInt();
+	      }
+	      
+	     System.out.println(inverse(arr,n));
+	}
+public static int inverse(int[] arr,int n)
+{
+	int pos = 1;
+    int ans = 0;
+    while(n>0) {
+  	  int rem = n%10;
+  	  ans = (int)(ans+pos*(Math.pow(10, rem-1)));
+  	  n/=10;
+  	  pos++;
+    }
+    return ans;
+}}
+	
+
diff --git a/Crux_Live_Jan22/src/Lec1/Add_Two_Number.java b/Crux_Live_Jan22/src/Lec1/Add_Two_Number.java
new file mode 100644
index 0000000..80d3540
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Add_Two_Number.java
@@ -0,0 +1,19 @@
+package Lec1;
+
+public class Add_Two_Number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int a = 30;
+		int b = 40;
+		int c = a+b;
+		System.out.println("sum of a and b is "+c);
+		
+		int a1 = 9;
+		int b1 = 3;
+		int c1 = a1/b1;
+		System.out.println(c1);
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Assignment_opt.java b/Crux_Live_Jan22/src/Lec1/Assignment_opt.java
new file mode 100644
index 0000000..b3a44ef
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Assignment_opt.java
@@ -0,0 +1,14 @@
+package Lec1;
+
+public class Assignment_opt {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+    int x = 5;
+    //x -= 5;
+    System.out.println(x);
+    x +=9;
+    System.out.println(x);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Grade_Card.java b/Crux_Live_Jan22/src/Lec1/Grade_Card.java
new file mode 100644
index 0000000..e339a3b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Grade_Card.java
@@ -0,0 +1,32 @@
+package Lec1;
+
+public class Grade_Card {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int marks = 45;
+		
+		if (marks >=80)
+		{
+			System.out.println(" A grade");
+		}
+		else if ( marks >= 70 && marks<80)
+		{
+			System.out.println(" B grade");
+		}
+		else if ( marks >= 60 && marks<70)
+		{
+			System.out.println(" C grade");
+		}
+		else if ( marks >= 50 && marks<60)
+		{
+			System.out.println(" D grade");
+		}
+		else
+		{
+			System.out.println("fail");
+		}
+			
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Maximum_of_three_nos.java b/Crux_Live_Jan22/src/Lec1/Maximum_of_three_nos.java
new file mode 100644
index 0000000..d975dbd
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Maximum_of_three_nos.java
@@ -0,0 +1,25 @@
+package Lec1;
+
+public class Maximum_of_three_nos {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     int a = 70;
+     int b = 100;
+     int c = 90;
+     
+     if (a>b && a>c)
+     {
+    	 System.out.println("a is greater");
+     }
+     if (b>a && b>c)
+     {
+    	 System.out.println("b is greater");
+     }
+     else
+     {
+    	 System.out.println("c is greater");
+     }
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/N_numbers_print.java b/Crux_Live_Jan22/src/Lec1/N_numbers_print.java
new file mode 100644
index 0000000..6751f85
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/N_numbers_print.java
@@ -0,0 +1,16 @@
+package Lec1;
+
+public class N_numbers_print {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+      int n = 10;
+      int i = 1;
+      while(i<n)
+      {
+    	  System.out.println(i);
+    	  i = i+1;
+      }
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Odd_Even.java b/Crux_Live_Jan22/src/Lec1/Odd_Even.java
new file mode 100644
index 0000000..c33a9a3
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Odd_Even.java
@@ -0,0 +1,18 @@
+package Lec1;
+
+public class Odd_Even {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+      int number = 99;
+    		  if(number%2 == 0)
+    		  {
+    			  System.out.println("number is even");
+    		  }
+    		  else
+    		  {
+    			  System.out.println("number is odd");
+    		  }
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Simple_intrest.java b/Crux_Live_Jan22/src/Lec1/Simple_intrest.java
new file mode 100644
index 0000000..8c92632
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Simple_intrest.java
@@ -0,0 +1,15 @@
+package Lec1;
+
+public class Simple_intrest {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int P = 30;
+		int R = 20;
+		int T = 40;
+		int SI = (P*R*T)/100;
+				System.out.println("simple intrest is "+SI);
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/Sum_of_n_numbers.java b/Crux_Live_Jan22/src/Lec1/Sum_of_n_numbers.java
new file mode 100644
index 0000000..63f628d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/Sum_of_n_numbers.java
@@ -0,0 +1,19 @@
+package Lec1;
+
+public class Sum_of_n_numbers {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+      int n = 10;
+      int i = 1;
+      int sum = 0;
+      while(i<n)
+      {
+    	  sum = sum+i;
+    	  System.out.println("sum of n numbers is "+sum);
+    	  i = i+1;
+    	
+      }
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec1/User_input.java b/Crux_Live_Jan22/src/Lec1/User_input.java
new file mode 100644
index 0000000..63144dc
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec1/User_input.java
@@ -0,0 +1,18 @@
+package Lec1;
+import java.util.*;
+
+public class User_input {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        Scanner sc = new Scanner(System.in);
+        
+        int n =sc.nextInt();
+       // int m =sc.nextInt();
+        //int k =sc.nextInt();
+        System.out.println(n);  
+        sc.close();
+      
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec10/Bubble_sort.java b/Crux_Live_Jan22/src/Lec10/Bubble_sort.java
new file mode 100644
index 0000000..ad36f94
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec10/Bubble_sort.java
@@ -0,0 +1,38 @@
+package Lec10;
+
+import java.util.Scanner;
+
+public class Bubble_sort {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     Scanner sc = new Scanner(System.in);
+     int n = sc.nextInt();
+     int[] arr = new int[n];
+     for(int i = 0;i<arr.length;i++)
+     {
+    	 arr[i]=sc.nextInt();
+     }
+     sort(arr);
+     for(int i=0;i<arr.length;i++)
+     {
+    	 System.out.println(arr[i]);
+     }
+	}
+public static void sort(int[] arr)
+{
+	for(int pass = 1;pass<arr.length;pass++)
+	{
+		for(int i=0;i<arr.length-pass;i++)
+		{
+			if(arr[i]>arr[i+1])
+			{
+				int temp = arr[i];
+				arr[i] = arr[i+1];
+				arr[i+1]=temp;
+			}
+		}
+	}
+	
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec10/Insertion_sort.java b/Crux_Live_Jan22/src/Lec10/Insertion_sort.java
new file mode 100644
index 0000000..a0ef8f1
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec10/Insertion_sort.java
@@ -0,0 +1,40 @@
+package Lec10;
+
+import java.util.Scanner;
+
+public class Insertion_sort {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		 Scanner sc = new Scanner(System.in);
+	     int n = sc.nextInt();
+	     int[] arr = new int[n];
+	     for(int i = 0;i<arr.length;i++)
+	     {
+	    	 arr[i]=sc.nextInt();
+	     }
+	     sort(arr);
+	     for(int i=0;i<arr.length;i++)
+	     {
+	    	 System.out.println(arr[i]);
+	     }
+		}
+	public static void sort(int[] arr)
+	{
+
+for(int i=1;i<arr.length;i++)
+{
+	int j=i-1;
+	int item=arr[i];
+	while(j>=0 && arr[j]>item)
+	{
+		arr[j+1]=arr[j];
+		j--;
+	}
+	j++;
+	arr[j]=item;
+}
+		
+	}
+	}
diff --git a/Crux_Live_Jan22/src/Lec10/Pair_Of_Roses.java b/Crux_Live_Jan22/src/Lec10/Pair_Of_Roses.java
new file mode 100644
index 0000000..6d49189
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec10/Pair_Of_Roses.java
@@ -0,0 +1,28 @@
+package Lec10;
+
+import java.util.Scanner;
+
+public class Pair_Of_Roses {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			int n = sc.nextInt();
+			int[] price = new int[n];
+			for(int i=0;i<price.length;i++)
+			{
+				price[i]=sc.nextInt();
+			}
+			int m = sc.nextInt();
+		}
+	}
+public static void pairofroses(int[]price,int m)
+{
+	int p1=0;
+	int p2 = 0;
+	int diff = Integer.MAX_VALUE;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec10/Selection_sort.java b/Crux_Live_Jan22/src/Lec10/Selection_sort.java
new file mode 100644
index 0000000..ca9f129
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec10/Selection_sort.java
@@ -0,0 +1,42 @@
+package Lec10;
+
+import java.util.Scanner;
+
+public class Selection_sort {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		 Scanner sc = new Scanner(System.in);
+	     int n = sc.nextInt();
+	     int[] arr = new int[n];
+	     for(int i = 0;i<arr.length;i++)
+	     {
+	    	 arr[i]=sc.nextInt();
+	     }
+	     sort(arr);
+	     for(int i=0;i<arr.length;i++)
+	     {
+	    	 System.out.println(arr[i]);
+	     }
+		}
+	public static void sort(int[] arr)
+	{
+
+for(int i=0;i<arr.length;i++)
+{
+	int min=i;
+	for(int j=i+1;j<arr.length;j++)
+	{
+		if(arr[j]<arr[min])
+		{
+			min=j;
+		}
+	}
+	int temp=arr[i];
+	arr[i]=arr[min];
+	arr[min]=temp;
+}
+	}
+	}
+
diff --git a/Crux_Live_Jan22/src/Lec11/Array_product_itself.java b/Crux_Live_Jan22/src/Lec11/Array_product_itself.java
new file mode 100644
index 0000000..646368a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec11/Array_product_itself.java
@@ -0,0 +1,44 @@
+package Lec11;
+
+import java.util.Scanner;
+
+public class Array_product_itself {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int[] ans = arrayprodduct(arr);
+		for(int i=0;i<arr.length;i++)
+		{
+			System.out.println(ans[i]);
+		}
+}
+	public static int[] arrayprodduct(int arr[])
+	{
+		int n = arr.length;
+		int[] left = new int[n];
+		int[] right = new int[n];
+		left[0]=1;
+		for(int i=1;i<n;i++)
+		{
+			left[i]=left[i-1]*arr[i-1];
+		}
+		right[n-1]=1;
+		for(int i=n-2;i>=0;i--)
+		{
+			right[i]=right[i-1]*arr[i-1];
+		}
+		for(int i=0;i<right.length;i--)
+		{
+			arr[i]=left[i]*right[i];
+		}
+		return arr;
+	}
+	}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec11/Maximum_Subarray.java b/Crux_Live_Jan22/src/Lec11/Maximum_Subarray.java
new file mode 100644
index 0000000..f502d34
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec11/Maximum_Subarray.java
@@ -0,0 +1,32 @@
+package Lec11;
+import java.util.*;
+public class Maximum_Subarray {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		  Scanner sc = new Scanner(System.in);
+	        int n = sc.nextInt();
+	        int[] arr = new int[n];
+	        for(int i=0;i<arr.length;i++)
+	        {
+	            arr[i]=sc.nextInt();
+	        }
+	  System.out.print(maximumsubarray(arr));
+	    }
+	public static int maximumsubarray(int[] arr)
+	{   int ans=Integer.MIN_VALUE;
+	    for(int i=0;i<arr.length;i++)
+	    {
+	        int prev_sum=0;
+	        
+	            for(int j=i;j<arr.length;j++)
+	            {
+	                prev_sum+=arr[j];
+	                ans=Math.max(ans,prev_sum);
+	            } 
+	        
+	    }
+	    return ans;
+	}
+	}
diff --git a/Crux_Live_Jan22/src/Lec11/Trapping_rainwater.java b/Crux_Live_Jan22/src/Lec11/Trapping_rainwater.java
new file mode 100644
index 0000000..3302a03
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec11/Trapping_rainwater.java
@@ -0,0 +1,44 @@
+package Lec11;
+
+import java.util.Scanner;
+
+public class Trapping_rainwater {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		System.out.println(trappingrainwater(arr));
+}
+	public static int trappingrainwater(int[] arr)
+	{
+		int n=arr.length;
+		int[] left = new int[n];
+		int[] right = new int[n];
+		left[0]=arr[0];
+		for(int i=1;i<n;i++)
+		{
+			left[i]=Math.max(left[i-1], arr[i]);
+		}
+		right[n-1]=arr[n-1];
+		for(int i=n-2;i>=0;i--)
+		{
+			right[i]=Math.max(right[i+1], arr[i]);
+		}
+		int ans=0;
+		for(int i=0;i<right.length;i++)
+		{
+			int min=Math.min(left[i], right[i]);
+			ans=ans+(min-arr[i]);
+		}
+		return ans;
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec12/Binary_search.java b/Crux_Live_Jan22/src/Lec12/Binary_search.java
new file mode 100644
index 0000000..647988d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec12/Binary_search.java
@@ -0,0 +1,41 @@
+package Lec12;
+
+import java.util.Scanner;
+
+public class Binary_search {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[]arr=new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int item=sc.nextInt();
+		System.out.println(binarysearch(arr,item));
+	}
+public static int binarysearch(int[]arr,int item)
+{
+	int lo=0;
+	int hi=arr.length-1;
+	while(lo<=hi)
+	{	int mid=(lo+hi)/2;
+		if(arr[mid]==item)
+		{
+			return mid;
+		}
+		else if(arr[mid]>item)
+		{
+			hi=mid-1;
+		}
+		else
+		{
+			lo=mid+1;
+		}
+	}
+	return -1;
+}
+}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec12/maximum_valueofx_for_n.java b/Crux_Live_Jan22/src/Lec12/maximum_valueofx_for_n.java
new file mode 100644
index 0000000..3529d92
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec12/maximum_valueofx_for_n.java
@@ -0,0 +1,39 @@
+package Lec12;
+
+import java.util.Scanner;
+
+public class maximum_valueofx_for_n {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[]arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int item = sc.nextInt();
+		System.out.println(forx(arr,n));
+	}
+public static int forx(int[]arr,int item)
+{   
+	int lo=0;
+	int hi=arr.length;
+	int ans=0;
+	while(lo<hi)
+	{
+		int mid=(lo+hi)/2;
+		if(mid*mid<=item)
+		{
+			ans=mid;
+			lo=mid+1;
+		}
+		else
+		{
+			hi=mid-1;
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec13/Input_and_Display.java b/Crux_Live_Jan22/src/Lec13/Input_and_Display.java
new file mode 100644
index 0000000..7f12bfc
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/Input_and_Display.java
@@ -0,0 +1,34 @@
+package Lec13;
+
+import java.util.Scanner;
+
+public class Input_and_Display {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int[][] arr= new int[n][m];
+		//System.out.println(arr[2][2]);
+		//take input
+		for(int i=0;i<arr.length;i++)
+		{
+		for(int j=0;j<arr[0].length;j++)
+		{
+		arr[i][j]=sc.nextInt();	
+		}
+		}
+		//print
+		for(int i=0;i<arr.length;i++)
+		{
+		for(int j=0;j<arr[0].length;j++)
+		{
+	     System.out.print(arr[i][j]);	
+		}
+		System.out.println();
+		}
+		
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec13/Jagged_Array.java b/Crux_Live_Jan22/src/Lec13/Jagged_Array.java
new file mode 100644
index 0000000..b299fcb
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/Jagged_Array.java
@@ -0,0 +1,30 @@
+package Lec13;
+
+import java.util.Scanner;
+
+public class Jagged_Array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[][]arr = new int[n][];
+		for(int i=0;i<arr.length;i++)
+		{
+		int c = sc.nextInt();//col
+		arr[i]=new int[c];
+		for(int j=0;j<arr[i].length;j++)
+		{
+		arr[i][j]=sc.nextInt();	
+		}
+		}
+		for(int i=0;i<arr.length;i++) {
+			for(int j=0;j<arr[i].length;j++)
+			{
+				System.out.print(arr[i][j]+"");
+			}
+		
+		System.out.println();}
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec13/Kadane_algorithm.java b/Crux_Live_Jan22/src/Lec13/Kadane_algorithm.java
new file mode 100644
index 0000000..2f80e9d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/Kadane_algorithm.java
@@ -0,0 +1,33 @@
+package Lec13;
+
+import java.util.Scanner;
+
+public class Kadane_algorithm {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[]arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]= sc.nextInt();
+		}
+		System.out.println(kadane(arr));
+	}
+public static int kadane(int[]arr)
+{
+	int ans= Integer.MIN_VALUE;
+	int previoussum=0;
+	for(int i=0;i<arr.length;i++)
+	{
+		previoussum+=arr[i];
+		ans=Math.max(ans,previoussum);
+		if(previoussum<0)
+		{
+			previoussum=0;
+		}		
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec13/Transpose_Matrix.java b/Crux_Live_Jan22/src/Lec13/Transpose_Matrix.java
new file mode 100644
index 0000000..3904470
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/Transpose_Matrix.java
@@ -0,0 +1,42 @@
+package Lec13;
+
+import java.util.Scanner;
+
+public class Transpose_Matrix {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc  = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[][]arr = new int[n][n];
+		for(int i=0;i<arr.length;i++)
+		{
+			for(int j=0;j<arr.length;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+	 Transpose(arr);
+	 for(int i=0;i<arr.length;i++)
+	 {
+		 for(int j =0;j<arr[0].length;j++)
+		 {
+			 System.out.print(arr[i][j]+"");
+		 }
+		 System.out.println();
+	 }
+	}
+	public static void Transpose(int[][]arr)
+	{
+		for(int row=0;row<arr.length;row++)
+		{
+			for(int col=row+1;col<arr.length;col++)
+			{
+				int temp = arr[row][col];
+				arr[row][col]=arr[col][row];
+				arr[col][row]=temp;
+			}
+		}
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec13/Vertical_wave.java b/Crux_Live_Jan22/src/Lec13/Vertical_wave.java
new file mode 100644
index 0000000..a74ce5c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/Vertical_wave.java
@@ -0,0 +1,40 @@
+package Lec13;
+
+import java.util.Scanner;
+
+public class Vertical_wave {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int[][]arr=new int[n][m];
+		for(int i=0;i<arr.length;i++)
+		{
+			for(int j = 0;j<arr[0].length;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+		print(arr);
+		
+	}
+public static void print(int[][]arr)
+{
+	 for(int col=0;col<arr[0].length;col++)
+	 {
+		 if(col%2==0)
+		 {	for(int row=0;row<arr.length;row++) {
+			 System.out.print(arr[row][col]+"");
+		 }}
+		 else
+		 {
+			 for(int row=arr.length-1;row>=0;row--)
+			 {
+				 System.out.print(arr[row][col]+"");
+			 }
+		 }
+	 }
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec13/two_d_Array.java b/Crux_Live_Jan22/src/Lec13/two_d_Array.java
new file mode 100644
index 0000000..15fd3c4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec13/two_d_Array.java
@@ -0,0 +1,18 @@
+package Lec13;
+
+public class two_d_Array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[][]arr = new int[3][4];
+		System.out.println(arr[1]);
+		System.out.println(arr[2]);
+		int[][]ar = new int[3][];
+		System.out.println(arr);
+		int[][] other = arr;
+		System.out.println(other);
+		System.out.println(arr.length);//for row length
+		System.out.println(arr[0].length);//for column length
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec14/Divisible_subarray.java b/Crux_Live_Jan22/src/Lec14/Divisible_subarray.java
new file mode 100644
index 0000000..4ca2b42
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec14/Divisible_subarray.java
@@ -0,0 +1,10 @@
+package Lec14;
+
+public class Divisible_subarray {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec14/Matrix_search.java b/Crux_Live_Jan22/src/Lec14/Matrix_search.java
new file mode 100644
index 0000000..ac0b143
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec14/Matrix_search.java
@@ -0,0 +1,45 @@
+package Lec14;
+
+import java.util.Scanner;
+
+public class Matrix_search {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int[][]arr = new int[n][m];
+		for(int i=0;i<arr.length;i++)
+		{
+			for(int j=0;j<arr[0].length;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+		int x = sc.nextInt();
+		System.out.println(search(arr, x));
+
+	}
+public static int search(int[][]arr,int x)
+{
+	int row=0;
+	int col = arr[0].length-1;
+	while(col>=0&&row<arr.length)
+	{
+		if(arr[row][col]==x)
+		{
+			return 1;
+		}
+		else if (arr[row][col]<x)
+		{
+			row++;
+		}
+		else
+		{
+			col--;
+		}
+	}
+	return 0;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec14/Spiral_print.java b/Crux_Live_Jan22/src/Lec14/Spiral_print.java
new file mode 100644
index 0000000..ce63dd5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec14/Spiral_print.java
@@ -0,0 +1,58 @@
+package Lec14;
+
+import java.util.Scanner;
+
+public class Spiral_print {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int [][]arr = new int[n][m];
+		for(int i=0;i<n;i++)
+		{
+			for(int j=0;j<m;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+		 spiral(arr);
+		 System.out.println("END");
+		 
+	}
+public static void spiral(int[][]arr)
+{
+	int minr=0;
+	int maxr = arr.length-1;
+	int minc=0;
+	int maxc = arr[0].length-1;
+	int total=arr.length*arr[0].length;
+	int count=0;
+	while(count<total) {
+	for(int i=minc;i<=maxc && count<total;i++)
+	{
+		System.out.print(arr[minr][i]+",");
+		count++;
+	}
+	minr++;
+	for(int i=minr;i<=maxr&& count<total;i++)
+	{
+		System.out.print(arr[i][maxc]+",");
+		count++;
+	}
+	maxc--;
+	for(int i=maxc;i>=minc && count<total;i--)
+	{
+		System.out.print(arr[maxr][i]+",");
+		count++;
+	}
+	maxr--;
+	for(int i=maxc;i>=minc && count<total;i++)
+	{
+		System.out.print(arr[minr][i]+",");
+		count++;
+	}
+	maxc++;}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec14/Spiral_print_practice.java b/Crux_Live_Jan22/src/Lec14/Spiral_print_practice.java
new file mode 100644
index 0000000..7e53934
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec14/Spiral_print_practice.java
@@ -0,0 +1,56 @@
+package Lec14;
+
+import java.util.Scanner;
+
+public class Spiral_print_practice {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int m = sc.nextInt();
+		int[][]arr = new int[n][m];
+		for(int i=0;i<n;i++)
+		{
+			for(int j=0;j<m;j++)
+			{
+				arr[i][j]=sc.nextInt();
+			}
+		}
+		spiral(arr);
+	}
+public static void spiral(int[][]arr)
+{
+	int minr=0;
+	int maxr=arr.length-1;
+	int minc = 0;
+	int maxc=arr[0].length-1;
+	int total=arr.length*arr[0].length;
+	int count=0;
+	while(count<total) {
+	for(int i=minc;i<=maxc && count<total;i++)
+	{
+		System.out.print(arr[minr][i]);
+		count++;
+	}
+	minr++;
+	for(int i=minr;i<=maxr && count<total;i++)
+	{
+		System.out.print(arr[i][maxc]);
+		count++;
+	}
+	maxc--;
+	for(int i=maxc;i>=minc && count<total;i--)
+	{
+		System.out.print(arr[maxr][i]);
+		count++;
+	}
+	maxr--;
+	for(int i=maxr;i>=minr && count<total;i--)
+	{
+		System.out.print(arr[i][minc]);
+		count++;
+	}
+	minc++;
+}
+}}
diff --git a/Crux_Live_Jan22/src/Lec15/Divisible_subarray_2.java b/Crux_Live_Jan22/src/Lec15/Divisible_subarray_2.java
new file mode 100644
index 0000000..e6df57f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec15/Divisible_subarray_2.java
@@ -0,0 +1,48 @@
+package Lec15;
+
+import java.util.Scanner;
+
+public class Divisible_subarray_2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0){
+			int n = sc.nextInt();
+			int[]arr = new int[n];
+			for(int i=0;i<arr.length;i++)
+			{
+				arr[i]=sc.nextInt();
+			}
+			System.out.println();
+		}
+	}
+public static long GoodSubArray(int[]arr)
+{
+	int n = arr.length;
+	long[]frq = new long[n];
+	long sum = 0;
+	frq[0]=1;
+	for(int i=0;i<frq.length;i++)
+	{
+		sum = sum+arr[i];
+		int idx = (int)(sum%n);
+		if(idx<0)
+		{
+			idx+=n;
+		}
+		frq[idx]=frq[idx]+1;
+	}
+	long ans = 0;
+	for(int i=0;i<frq.length;i++)
+	{
+		if(frq[i]>=2)
+		{
+			
+			ans = ans+(frq[i]*(frq[i]-1))/2;
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec15/String_demo.java b/Crux_Live_Jan22/src/Lec15/String_demo.java
new file mode 100644
index 0000000..38d9729
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec15/String_demo.java
@@ -0,0 +1,17 @@
+package Lec15;
+
+public class String_demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		 String str = "hello";
+		 String str1 = "hello";
+		 //System.out.println(str);
+		 String st = new String("hello");
+		 str = str+"bye";
+		 System.out.println(str);
+		 System.out.println(str.length());
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec15/String_demo2.java b/Crux_Live_Jan22/src/Lec15/String_demo2.java
new file mode 100644
index 0000000..608915c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec15/String_demo2.java
@@ -0,0 +1,16 @@
+package Lec15;
+
+public class String_demo2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str = "hello";
+		String str1 = "hello";
+		String st = new String("hello");
+		String st1 = new String("hello");
+		System.out.println(st1==st); //== double equal address compare karta hai
+		System.out.println(st1.equals(st)); //.equals value compare karta hai
+		System.out.println(str.equals(str1));//because dono string pool me bn rahe hai to address or value dono same hoga
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec15/String_demo3.java b/Crux_Live_Jan22/src/Lec15/String_demo3.java
new file mode 100644
index 0000000..25e9222
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec15/String_demo3.java
@@ -0,0 +1,16 @@
+package Lec15;
+
+public class String_demo3 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str = "abcdef";
+		System.out.println(str.charAt(5));//charAt is used to find position of element at particular index
+		System.out.println(str.substring(2,6));//.substring for getting substring between beginning index to end index
+		String s1 = str.substring(2,6);
+		System.out.println(str.substring(1));//used for getting beginning to end of index
+		System.out.println(str.substring(1,1));
+		System.out.println(str.concat(s1));
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec15/String_demo4.java b/Crux_Live_Jan22/src/Lec15/String_demo4.java
new file mode 100644
index 0000000..81b4de7
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec15/String_demo4.java
@@ -0,0 +1,13 @@
+package Lec15;
+
+public class String_demo4 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str = "12";
+		String str1 = "20";
+		System.out.println(str.concat(str1));
+		System.out.println(str+(10+30));
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec16/String_Compression.java b/Crux_Live_Jan22/src/Lec16/String_Compression.java
new file mode 100644
index 0000000..ac5482d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec16/String_Compression.java
@@ -0,0 +1,29 @@
+package Lec16;
+
+public class String_Compression {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+	  String str = "aaabbccds";
+	  System.out.println(stringcom(str));
+	}
+public static int stringcom(String str)
+{
+	int count =0;
+	int res=0;
+	for(int i=0;i<str.length();i++)
+	{
+		if(str.charAt(i)==(str.charAt(+1)))
+		{
+			count++;
+			res +=str.charAt(i)+ count;
+		}
+		else {
+			count=0;
+			i++;
+		}
+		
+	}
+	return res;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec16/SubString_methods.java b/Crux_Live_Jan22/src/Lec16/SubString_methods.java
new file mode 100644
index 0000000..5a3081b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec16/SubString_methods.java
@@ -0,0 +1,20 @@
+package Lec16;
+
+public class SubString_methods {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str  = "abcd";
+		pringsubstring(str);
+	}
+public static void pringsubstring(String str)
+{
+	for(int i=0;i<str.length();i++)
+	{
+		for(int j=i+1;j<=str.length();j++)
+		{
+			System.out.println(str.substring(i,j));
+		}
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec16/finding_cb_number.java b/Crux_Live_Jan22/src/Lec16/finding_cb_number.java
new file mode 100644
index 0000000..4f58a24
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec16/finding_cb_number.java
@@ -0,0 +1,80 @@
+package Lec16;
+
+import java.util.Scanner;
+
+public class finding_cb_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		sc.nextLine();
+		String strInput = sc.nextLine();
+		System.out.println(PrintSubtring(strInput));
+
+	}
+
+	public static int PrintSubtring(String str) {
+		int count = 0;
+		boolean[] visited = new boolean[str.length()];
+		for (int len = 1; len <= str.length(); len++) {
+			for (int si = 0; si <= str.length() - len; si++) {
+				int ei = si + len;
+				String s = str.substring(si, ei);// CB Number
+				// Integer.parseInt(s);// string to Integer
+				// Long.parseLong(s);// String to long
+				if (iscbnumber(Long.parseLong(s)) == true && isvistied(visited, si, ei - 1) == false) {
+                      // visited marked 
+					for (int i = si; i <= ei - 1; i++) {
+						visited[i] = true;
+
+					}
+					count++;
+				}
+
+			}
+
+		}
+
+		return count;
+
+	}
+
+	public static boolean isvistied(boolean[] visited, int si, int ei) {
+		// TODO Auto-generated method stub
+		for (int i = si; i <= ei; i++) {
+			if (visited[i] == true) {
+				return true;
+			}
+
+		}
+		return false;
+
+	}
+
+	public static boolean iscbnumber(long n) {
+		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
+		// point 1
+		if (n == 0 || n == 1) {
+			return false;
+		}
+		// point 2
+
+		for (int i = 0; i < arr.length; i++) {
+			if (arr[i] == n) {
+				return true;
+			}
+		}
+
+		// point 3
+		for (int i = 0; i < arr.length; i++) {
+			if (n % arr[i] == 0) {
+				return false;
+			}
+		}
+
+		return true;
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec16/good_substring.java b/Crux_Live_Jan22/src/Lec16/good_substring.java
new file mode 100644
index 0000000..385d5d9
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec16/good_substring.java
@@ -0,0 +1,32 @@
+package Lec16;
+
+import java.util.Scanner;
+
+public class good_substring {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+	Scanner sc = new Scanner(System.in);
+	String str = sc.next();
+	System.out.println(good(str));
+	}
+   public static int good(String str) {
+   int ans=0;
+   int count=0;
+   for(int i=0;i<str.length();i++)
+   {   char ch = str.charAt(i);
+	   if(vowels(ch)==true) {count++;
+   }
+	   else {
+		   ans = Math.max(ans, count);
+		   count=0;
+	   }
+}
+   ans = Math.max(ans, count);
+   return ans;
+   }
+   public static boolean vowels(char ch) {
+	   if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {return true;
+   }
+	   return false;
+}}
diff --git a/Crux_Live_Jan22/src/Lec16/palindrome_substring.java b/Crux_Live_Jan22/src/Lec16/palindrome_substring.java
new file mode 100644
index 0000000..f91a534
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec16/palindrome_substring.java
@@ -0,0 +1,40 @@
+package Lec16;
+
+public class palindrome_substring {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str  = "nitin";
+	    printsubstring(str);
+		
+	}
+public static void printsubstring(String str)
+{
+	for(int i=0;i<str.length();i++)
+	{
+		for(int j=i+1;j<=str.length();j++)
+		{
+			String s1=str.substring(i,j);
+			if(ispalindrome(s1)==true)
+			{
+				System.out.println(s1);
+			}
+		}
+	}
+}
+public static boolean ispalindrome(String s )
+{
+	int i=0;
+	int j=s.length()-1;
+	while(i<j) {
+		if(s.charAt(i)!= s.charAt(j))
+		{
+			return false;
+		}
+		i++;
+		j--;
+	}
+	return true;
+}
+}
+
diff --git a/Crux_Live_Jan22/src/Lec17/book_allocation_problem.java b/Crux_Live_Jan22/src/Lec17/book_allocation_problem.java
new file mode 100644
index 0000000..d46f834
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec17/book_allocation_problem.java
@@ -0,0 +1,65 @@
+package Lec17;
+
+import java.util.Scanner;
+
+public class book_allocation_problem {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int t = sc.nextInt();
+		while(t-->0)
+		{
+			int nob = sc.nextInt();
+			int nos = sc.nextInt();
+			int[] pages = new int[nob];
+			for(int i=0;i<pages.length;i++)
+			{
+				pages[i]=sc.nextInt();
+			}
+		System.out.println(maximumbookread(pages,nos));
+		}
+	}
+public static int maximumbookread(int[]pages,int nos)
+{
+	int lo=0;
+	int hi=0;
+	for(int i=0;i<pages.length;i++)
+	{
+		hi = hi+pages[i];
+	}
+	int ans =0;
+	while(lo<=hi)
+	{	int mid = (lo+hi)/2;
+		if(isitpossible(pages,mid,nos)==true) {
+		ans = mid;
+		hi = mid-1;
+	}
+	else
+	{
+		lo = mid+1;
+	}}
+	return ans;}
+public static boolean isitpossible(int[] pages,int mid,int nos)
+{
+	int student =1;
+	int read_page = 0;
+	int i = 0;
+	while(i<pages.length)
+	{	if(read_page+pages[i]<=mid)
+	{
+		read_page+=pages[i];
+		i++;
+	}
+	else {
+		student++;
+		read_page = 0;
+	}
+	
+	if(student>nos)
+	{
+		return false;
+	}}
+	return true;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec18/Array_list_demo.java b/Crux_Live_Jan22/src/Lec18/Array_list_demo.java
new file mode 100644
index 0000000..48de931
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec18/Array_list_demo.java
@@ -0,0 +1,55 @@
+package Lec18;
+import java.util.*;
+
+public class Array_list_demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		ArrayList<Integer>list = new ArrayList<>();
+		System.out.println(list);
+		//add :- last se add krega
+		list.add(10);
+		list.add(20);
+		System.out.println(list);
+		
+		//add at index
+		//range 0 to size
+		list.add(2, 30);
+		System.out.println(list);
+		System.out.println(list.size());
+		
+		//delete:-range of delete is size-1
+		System.out.println(list.remove(1));
+		System.out.println(list);
+		list.add(40);
+		list.add(50);
+		System.out.println(list);
+		//get range is 0 to size-1
+		System.out.println(list.get(0));
+		//update at index
+		//set is used
+		list.set(1, 123);
+		System.out.println(list);
+		for(int i=0;i<list.size();i++)
+		{
+			System.out.println(list.get(i));
+		}
+		System.out.println(list);
+		//enhance for loop
+		for(int var:list) {
+			System.out.print(var+" ");
+		}
+		System.out.println();
+		Collections.sort(list);
+		//2D array
+		//int[][]a = new int[2][3];
+		//for(int[]a1:a) {
+		//	for(int i:a1)
+		//	{
+		//		System.out.println(i);
+		//	}
+		//}
+		
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec18/Arraylist_userinput.java b/Crux_Live_Jan22/src/Lec18/Arraylist_userinput.java
new file mode 100644
index 0000000..85ac7c1
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec18/Arraylist_userinput.java
@@ -0,0 +1,22 @@
+package Lec18;
+import java.util.*;
+public class Arraylist_userinput {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		ArrayList<Integer>l1 = new ArrayList<>();
+		for(int i=0;i<4;i++)
+		{
+			l1.add(sc.nextInt());
+		}
+		for(int i=0;i<l1.size();i++)
+		{
+			System.out.println(l1.get(i));
+		}
+		System.out.println();
+		
+		
+	} 
+
+}
diff --git a/Crux_Live_Jan22/src/Lec18/Diagonal_Traverse.java b/Crux_Live_Jan22/src/Lec18/Diagonal_Traverse.java
new file mode 100644
index 0000000..50c288a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec18/Diagonal_Traverse.java
@@ -0,0 +1,47 @@
+package Lec18;
+import java.util.*;
+public class Diagonal_Traverse {
+	public static void main(String[] args)
+	{
+		
+	}
+public static int[] findthediagonal(int[][]arr)
+{
+	int n = arr.length;
+	int m = arr[0].length;
+	int[] ans = new int[n*m];
+	int i =0;
+	for(int d = 0;d<n+m-1;d++)
+	{
+		int r = 0;
+		int c = 0;
+		if(d<m)
+		{
+			r=0;
+			c =d;
+		}
+		else
+		{
+			r = d-m+1;
+			c = m-1;
+		}
+		ArrayList<Integer>list = new ArrayList<>();
+		while(r<n && c>=0)
+		{
+			list.add(arr[r][c]);
+			r++;
+			c--;
+		}
+		if(d%2==0)
+		{
+			Collections.reverse(list);
+		}
+		for(int val:list)
+		{
+			ans[i]=val;
+			i++;
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec18/Wrapper_Demo.java b/Crux_Live_Jan22/src/Lec18/Wrapper_Demo.java
new file mode 100644
index 0000000..b4a0fff
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec18/Wrapper_Demo.java
@@ -0,0 +1,36 @@
+package Lec18;
+
+public class Wrapper_Demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Integer a = 100;
+		int a1 = 10;
+		System.out.println(a);
+		System.out.println(a1);
+		Short s1 = 78;
+		//Byte b1 = 19;
+		System.out.println(s1);
+		//System.out.println(b1);
+		a = a1;   //autoboxing :- when we put primitive to corresponding wrapper class 
+		System.out.println(a);
+		Integer ii = 100;
+		int i = 10;
+		i = ii;// un boxing :- when we out wrapper class to its correspondiong primitive class
+		System.out.println(i);
+		
+		//important
+		Integer b1 = 19;
+		Integer b2 = 19;
+		System.out.println(b1 == b2);//integer cache ki wajah se true aaega duplicate create nhi krega
+		Integer c1 = 190;
+		Integer c2 = 190;
+		System.out.println(c1 == c2);//range exceed ho jaega is liye equal nhi hoga -128 to 127
+		// Integer,long,short,byte me dublicate create nhi hoga inke liye range fix hota hai -128 to 127
+		long l1 = 127l;
+		long l2 = 127l;
+		System.out.println(l1 == l2);
+				
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec19/Kartik_bhaiya_and_strings.java b/Crux_Live_Jan22/src/Lec19/Kartik_bhaiya_and_strings.java
new file mode 100644
index 0000000..92087e4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec19/Kartik_bhaiya_and_strings.java
@@ -0,0 +1,38 @@
+package Lec19;
+
+import java.util.Scanner;
+
+public class Kartik_bhaiya_and_strings {
+	public static void main(String[] args)
+	{
+		Scanner sc = new Scanner(System.in);
+		int k = sc.nextInt();
+		String str = sc.next();
+		int flipa = maximumlength(str,k,'a');
+		int flipb = maximumlength(str,k,'b');
+		System.out.println(Math.max(flipa, flipb));
+		
+	}
+public static int maximumlength(String str,int k,char ch)
+{
+	int si=0;
+	int ei =0;
+	int ans=0;
+	int flip = 0;
+	while(ei<str.length()) {
+		if(str.charAt(ei)==ch) {
+			flip++;
+		}
+		while(flip>k && si<=ei) {
+			if(str.charAt(si)==ch) {
+				flip--;
+			}
+			si++;
+		}
+		ans = Math.max(ans, ei-si+1);
+		ei++;
+	}
+return ans;
+
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec19/Maximum_sum_of_window_size_k.java b/Crux_Live_Jan22/src/Lec19/Maximum_sum_of_window_size_k.java
new file mode 100644
index 0000000..2a4733a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec19/Maximum_sum_of_window_size_k.java
@@ -0,0 +1,26 @@
+package Lec19;
+
+public class Maximum_sum_of_window_size_k {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[]arr = {1,3,-1,-3,5,3,6,7};
+		int k = 3;
+		System.out.println(maximumsum(arr,k));
+	}
+public static int maximumsum(int[]arr,int k){
+	int sum=0;
+	//1st first window
+	for(int i=0;i<k;i++)
+	{
+		sum+=arr[i];
+	}
+	int ans = sum;
+	for(int i=k;i<arr.length;i++)
+	{
+		sum+=arr[i];//window grow
+		sum-=arr[i-k];//window small
+		ans = Math.max(ans, sum);//ans update
+	}
+	return ans;
+}}
diff --git a/Crux_Live_Jan22/src/Lec19/Subarray_Product_Less_Than_K.java b/Crux_Live_Jan22/src/Lec19/Subarray_Product_Less_Than_K.java
new file mode 100644
index 0000000..b7f3e2e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec19/Subarray_Product_Less_Than_K.java
@@ -0,0 +1,40 @@
+package Lec19;
+
+import java.util.Scanner;
+
+public class Subarray_Product_Less_Than_K {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int k = sc.nextInt();
+		int[]arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+	    System.out.println(countsubarray(arr, k));
+	}
+public static int countsubarray(int[]arr,int k)
+{
+	int si=0;
+	int ei =0;
+	int ans=0;
+	int p=1;
+	while(ei<arr.length)
+	{
+		//window grow
+		p = p*arr[ei];
+		//window shrink
+		while(p>=k && si<=ei)
+		{
+			p=p/arr[si];
+			si++;
+		}
+		ans = ans + ei-si+1;
+		ei++;
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern1.java b/Crux_Live_Jan22/src/Lec2/Pattern1.java
new file mode 100644
index 0000000..a3b1cf0
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern1.java
@@ -0,0 +1,26 @@
+package Lec2;
+
+import java.util.*;
+
+public class Pattern1 {
+
+	public static void main(String[] args) {
+	// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int row = 1;
+		int star = n;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=star)
+				{
+				System.out.print("*"+" ");
+				i = i+1;
+				
+			}
+			row = row+1;
+			System.out.println();
+			sc.close();
+		}
+	}}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern10.java b/Crux_Live_Jan22/src/Lec2/Pattern10.java
new file mode 100644
index 0000000..7a74ba7
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern10.java
@@ -0,0 +1,37 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern10 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new  Scanner(System.in);
+		int n = sc.nextInt();
+		int row = 1;
+		int space = 0;
+		
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j = 1;
+			int k = 2*n-1;
+			while(j<=k)
+			{
+				System.out.print("*"+" ");
+				j=j+1;
+			}
+			space = space+1;
+			n = n-1;
+			System.out.println();
+			sc.close();
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern11.java b/Crux_Live_Jan22/src/Lec2/Pattern11.java
new file mode 100644
index 0000000..d261cc7
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern11.java
@@ -0,0 +1,46 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern11 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=l;
+			while(j<=k)
+			{
+				System.out.print("*"+"   ");
+				j = j+1;
+			}
+			
+			int m = 1;
+			while(m<=space)
+			{
+				System.out.print("  ");
+				m = m+1;
+			}
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern12.java b/Crux_Live_Jan22/src/Lec2/Pattern12.java
new file mode 100644
index 0000000..736a1db
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern12.java
@@ -0,0 +1,53 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern12 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k) {
+				if(j%2==0)
+			{
+				System.out.print("!"+" ");
+				j = j+1;
+			}
+				else
+				{
+					System.out.print("*"+" ");
+					j = j+1;
+					
+				}}
+			
+			int m = 1;
+			while(m<=space)
+			{
+				System.out.print("  ");
+				m = m+1;
+			}
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern2.java b/Crux_Live_Jan22/src/Lec2/Pattern2.java
new file mode 100644
index 0000000..c9a08a8
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern2.java
@@ -0,0 +1,32 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int row = 1;
+		int star = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=star)
+			{
+			System.out.print("*"+" ");
+			i = i+1;
+			}
+		
+		    star =star+1;
+			row = row+1;
+			System.out.println();
+			sc.close();
+		}
+	}
+}
+
+	
+
+
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern23.java b/Crux_Live_Jan22/src/Lec2/Pattern23.java
new file mode 100644
index 0000000..f58f60d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern23.java
@@ -0,0 +1,46 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern23 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k)
+			{
+				System.out.print("1"+" ");
+				j = j+1;
+			}
+			
+			int m = 1;
+			while(m<=space)
+			{
+				System.out.print("  ");
+				m = m+1;
+			}
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern24.java b/Crux_Live_Jan22/src/Lec2/Pattern24.java
new file mode 100644
index 0000000..8c73b3f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern24.java
@@ -0,0 +1,46 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern24 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k)
+			{
+				System.out.print(row+" ");
+				j = j+1;
+			}
+			
+			int m = 1;
+			while(m<=space)
+			{
+				System.out.print("  ");
+				m = m+1;
+			}
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern25.java b/Crux_Live_Jan22/src/Lec2/Pattern25.java
new file mode 100644
index 0000000..bd2cc06
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern25.java
@@ -0,0 +1,44 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern25 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int count = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k)
+			{
+				System.out.print(count+" ");
+				count = count+1;
+				j = j+1;
+			}
+			
+			
+
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern26.java b/Crux_Live_Jan22/src/Lec2/Pattern26.java
new file mode 100644
index 0000000..ee4a36f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern26.java
@@ -0,0 +1,46 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern26 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k)
+			{
+				System.out.print(j+" ");
+				j = j+1;
+			}
+			
+			int m = 1;
+			while(m<=space)
+			{
+				System.out.print("  ");
+				m = m+1;
+			}
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern3.java b/Crux_Live_Jan22/src/Lec2/Pattern3.java
new file mode 100644
index 0000000..1b8ee85
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern3.java
@@ -0,0 +1,30 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern3 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     Scanner sc = new Scanner(System.in);
+     int n = sc.nextInt();
+     int row = 1;
+	    int star = n;
+	    while(row<=n)
+	    {
+	    	int i = 1;
+	    	while(i<=star)
+	    	{
+	    		System.out.print("*"+" ");
+	    		i = i+1;
+	    	}
+	    	star = star-1;
+	    	row = row+1;
+	    	System.out.println();
+	    	sc.close();
+	    	
+	    }
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern4.java b/Crux_Live_Jan22/src/Lec2/Pattern4.java
new file mode 100644
index 0000000..08efbaa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern4.java
@@ -0,0 +1,35 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern4 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int row = 1;
+		int star = 1;
+		int space = n-1;
+		while(row<=n)
+		{
+			int i = 1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j = 1;
+			while(j<=star)
+			{
+				System.out.print("*"+" ");
+				j = j+1;
+			}
+			row = row+1;
+			space = space-1;
+			star = star+1;
+			System.out.println();
+			sc.close();
+		}}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern5.java b/Crux_Live_Jan22/src/Lec2/Pattern5.java
new file mode 100644
index 0000000..20c6f70
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern5.java
@@ -0,0 +1,38 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern5 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+	    
+        int row = 1;
+        int star = n;
+        int space = 0;
+        while(row<=n)
+        {
+        	int i = 1;
+        	while(i<=space)
+        	{
+        		System.out.print("  ");
+        		i = i+1;
+        	}
+        	int j=1;
+        	while(j<=star)
+        	{
+        		System.out.print("*"+" ");
+        		j = j+1;
+        	}
+        	space = space+1;
+        	star = star-1;
+        	row = row+1;
+        	System.out.println();
+        	sc.close();
+        }
+	}
+
+	}
+
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern6.java b/Crux_Live_Jan22/src/Lec2/Pattern6.java
new file mode 100644
index 0000000..bc172c5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern6.java
@@ -0,0 +1,35 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern6 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+      Scanner sc = new Scanner(System.in);
+      int n = sc.nextInt();
+      int row = 1;
+      int star = n;
+      int space =0;
+      while(row<=n)
+      {
+    	  int i=1;
+    	  while(i<=space)
+    	  {
+    		  System.out.print("  ");
+    		  i = i+1;
+    	  }
+    	  int j = 1;
+    	  while(j<=star) {
+    		  System.out.print("*"+" ");
+    	      j = j+1;}
+    			  
+     
+      row = row+1;
+      space = 2*(row)-2;
+      star = star-1;
+      System.out.println();
+      sc.close();
+	}
+
+}}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern7.java b/Crux_Live_Jan22/src/Lec2/Pattern7.java
new file mode 100644
index 0000000..0f8287d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern7.java
@@ -0,0 +1,42 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern7 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int row = 1;
+		while(row<=n)
+		{
+			if(row==1||row==n)
+			
+			{   int i=1;
+				while(i<=n) {
+			
+				System.out.print("*"+" ");
+				i = i+1;}
+			}
+			else
+			{
+				System.out.print("*"+" ");
+				 int i=1;
+				while(i<=n-2)
+				{
+					System.out.print("  ");
+					i = i+1;
+				}
+				System.out.print("*"+" ");
+			}
+		    System.out.println();
+		    row = row+1;
+		    sc.close();
+				
+		}
+		
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec2/Pattern9.java b/Crux_Live_Jan22/src/Lec2/Pattern9.java
new file mode 100644
index 0000000..8a2d110
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec2/Pattern9.java
@@ -0,0 +1,42 @@
+package Lec2;
+
+import java.util.Scanner;
+
+public class Pattern9 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n  = sc.nextInt();
+		int row = 1;
+		int space  = n-1;
+		int l = 1;
+		while(row<=n)
+		{
+			int i=1;
+			while(i<=space)
+			{
+				System.out.print("  ");
+				i = i+1;
+			}
+			int j =1;
+			int k=(2*l)-1;
+			while(j<=k)
+			{
+				System.out.print("*"+" ");
+				j = j+1;
+			}
+			
+		
+			
+			row = row+1;
+			l = l+1;
+			space = space-1;
+			System.out.println();
+			sc.close();
+			
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec20/Facto.java b/Crux_Live_Jan22/src/Lec20/Facto.java
new file mode 100644
index 0000000..2845dea
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec20/Facto.java
@@ -0,0 +1,18 @@
+package Lec20;
+
+public class Facto {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n =5;
+		System.out.println(fact(n));}
+public static int fact(int n) {
+	if(n==0)//base case (smaller problem)
+	{
+		return 1;
+	}
+	int fn = fact(n-1);//recursion used to solve base smaller problem
+	return fn*n;//smaller problem +self work = bigger problem
+
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec20/PDI.java b/Crux_Live_Jan22/src/Lec20/PDI.java
new file mode 100644
index 0000000..aee5218
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec20/PDI.java
@@ -0,0 +1,19 @@
+package Lec20;
+
+public class PDI {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		inc(n);
+	}
+public static void inc(int n)
+{
+	if(n==0) {
+		return ;
+	}
+	System.out.println(n);
+	inc(n-1);
+	System.out.println(n);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec20/power.java b/Crux_Live_Jan22/src/Lec20/power.java
new file mode 100644
index 0000000..1a7980d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec20/power.java
@@ -0,0 +1,19 @@
+package Lec20;
+
+public class power {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int a=2;
+		int b=5;
+		System.out.println(pow(a,b));
+	}
+public static int pow(int a,int b)
+{   
+	if(b==0) {
+		return 1;
+	}
+	int ans = pow(a,b-1);//a^b-1
+	return ans*a;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec20/print_dec.java b/Crux_Live_Jan22/src/Lec20/print_dec.java
new file mode 100644
index 0000000..770fbf5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec20/print_dec.java
@@ -0,0 +1,19 @@
+package Lec20;
+
+public class print_dec {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		pd(n);
+	}
+public static void pd(int n)
+{
+	if(n==0)
+	{
+		return ;
+	}
+	System.out.println(n);
+	pd(n-1);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec20/print_inc.java b/Crux_Live_Jan22/src/Lec20/print_inc.java
new file mode 100644
index 0000000..8d5582f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec20/print_inc.java
@@ -0,0 +1,18 @@
+package Lec20;
+
+public class print_inc {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		inc(n);
+	}
+public static void inc(int n)
+{
+	if(n==0) {
+		return ;
+	}
+	System.out.println(n);
+	inc(n-1);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec21/All_Indices_Problem.java b/Crux_Live_Jan22/src/Lec21/All_Indices_Problem.java
new file mode 100644
index 0000000..0c44cb3
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/All_Indices_Problem.java
@@ -0,0 +1,32 @@
+package Lec21;
+
+import java.util.Scanner;
+
+public class All_Indices_Problem {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int arr[]=new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int item=sc.nextInt();
+		allindex(arr,0,item);
+	}
+public static void  allindex(int[]arr,int i,int item)
+{   
+	if(i==arr.length && arr.length!=item) {
+		return ;
+	}
+	if(arr[i]==item)
+	{
+		System.out.print(i+" ");
+	
+	}
+	allindex(arr,i+1,item);
+}
+}
+
diff --git a/Crux_Live_Jan22/src/Lec21/Fabonacci_series.java b/Crux_Live_Jan22/src/Lec21/Fabonacci_series.java
new file mode 100644
index 0000000..55fc94a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/Fabonacci_series.java
@@ -0,0 +1,19 @@
+package Lec21;
+
+public class Fabonacci_series {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		System.out.println(fabo(n));
+	}
+public static int fabo(int n)
+{
+	if (n==0 || n==1) {
+		return n;
+	}
+	int f1=fabo(n-1);
+	int f2 =fabo(n-2);
+	return f1+f2;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec21/Subsequence.java b/Crux_Live_Jan22/src/Lec21/Subsequence.java
new file mode 100644
index 0000000..9f699b8
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/Subsequence.java
@@ -0,0 +1,33 @@
+package Lec21;
+
+public class Subsequence {
+    
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str = "abc";
+	//	System.out.print("\n"+printsubseq(str,""));
+	printsubseq(str,"");
+	}
+//public static int printsubseq(String ques,String ans) {
+	//if(ques.length()==0) {
+	//	System.out.println(ans);
+	
+	//	return 1;
+	//}
+	//char ch = ques.charAt(0);
+	//int f1 = printsubseq(ques.substring(1),ans);
+	//int f2 = printsubseq(ques.substring(1),ans+ch);
+	//return f1+f2;
+//}
+	public static void printsubseq(String ques,String ans)
+	{
+		if(ques.length()==0)
+		{
+			System.out.println(ans);
+			return;
+		}
+		char ch = ques.charAt(0);
+	 printsubseq(ques.substring(1),ans);
+	  printsubseq(ques.substring(1),ans+ch);
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec21/facto1.java b/Crux_Live_Jan22/src/Lec21/facto1.java
new file mode 100644
index 0000000..93cc153
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/facto1.java
@@ -0,0 +1,18 @@
+package Lec21;
+
+public class facto1 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		System.out.println(fact(n,1));
+	}
+public static int fact(int n,int ans)
+{
+	//base case
+	if(n==0) {
+		return ans;
+	}
+	return fact(n-1,ans*n);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec21/first_occurenece.java b/Crux_Live_Jan22/src/Lec21/first_occurenece.java
new file mode 100644
index 0000000..e7be7a5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/first_occurenece.java
@@ -0,0 +1,18 @@
+package Lec21;
+
+public class first_occurenece {
+     public static void main(String[] args) {
+    	 int[]arr = {0,1,2,3,4,5,3,};
+	System.out.println(firstoccurence(arr,0,3));
+}
+     public static int firstoccurence(int[]arr,int i,int item)
+     {
+    	 if(i==arr.length) {
+    		 return -1;
+    	 }
+    	 if(arr[i]==item) {
+    		 return i;
+    	 }
+    	 return firstoccurence(arr,i+1,item);
+     }
+}
diff --git a/Crux_Live_Jan22/src/Lec21/last_index.java b/Crux_Live_Jan22/src/Lec21/last_index.java
new file mode 100644
index 0000000..b44d179
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21/last_index.java
@@ -0,0 +1,30 @@
+package Lec21;
+import java.util.*;
+public class last_index {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		    Scanner sc = new Scanner(System.in);
+	        int n = sc.nextInt();
+	        int[]arr = new int[n];
+	        for(int i=0;i<n;i++)
+	        {
+	            arr[i]=sc.nextInt();
+	        }
+	        int item = sc.nextInt();
+	        int i=arr.length-1;
+	        firstoccurence(arr,item,i);
+	    }
+	  public static void firstoccurence(int[]arr,int item,int i)
+	     {
+	    	 if(i<0) {
+	    		 return ;
+	    	 }
+	    	 if(arr[i]==item) {
+	    		 System.out.println(i+"");
+	    		 return;
+	    	 }
+	    	 firstoccurence(arr,item,i-1);
+	     }
+	}
+	
diff --git a/Crux_Live_Jan22/src/Lec21A/Kadanes_algo.java b/Crux_Live_Jan22/src/Lec21A/Kadanes_algo.java
new file mode 100644
index 0000000..c8f4e1f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21A/Kadanes_algo.java
@@ -0,0 +1,22 @@
+package Lec21A;
+
+public class Kadanes_algo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int []arr = {-11,-12,2,3,-3,7,-3};
+		System.out.println(maxsubarraysum(arr));
+	}
+public static int maxsubarraysum(int[]arr) {
+	int ans = Integer.MIN_VALUE;
+	int curr_sum=0;
+	for(int i=0;i<arr.length;i++) {
+		curr_sum+=arr[i];
+		ans = Math.max(curr_sum,ans);
+		if(curr_sum<0) {
+			curr_sum=0;
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec21A/minimum_window_substring.java b/Crux_Live_Jan22/src/Lec21A/minimum_window_substring.java
new file mode 100644
index 0000000..85133e9
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec21A/minimum_window_substring.java
@@ -0,0 +1,50 @@
+package Lec21A;
+
+public class minimum_window_substring {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String s="ADOBECODEBANC";
+		String t = "ABC";
+		System.out.println( minimumwindow(s,t));
+
+	}
+public static String minimumwindow(String s,String t)
+{
+	int[] freqt = new int[256];
+	int[] freqs = new int[256];
+	for(int i=0;i<t.length();i++)
+	{
+		char ch = t.charAt(i);
+		freqt[ch]++;
+	}
+	int count=0;
+	int ws=Integer.MAX_VALUE;
+	int si=0;
+	int start=-1;
+	for(int ei=0;ei<s.length();ei++)
+	{
+		char ch = s.charAt(ei);
+		freqs[ch]++;
+		if(freqt[ch]>=freqs[ch]) {
+			count++;
+		}
+		if(count==t.length()) {//window
+			//shrink
+			while(freqs[s.charAt(si)]>freqt[s.charAt(si)]) {
+				freqs[s.charAt(si)]--;
+				si++;
+			}
+			if(ws>ei-si+1) {
+				ws=ei-si+1;
+				start=si;
+			}
+		}
+	}
+	if(start==-1)
+	{
+		return "";
+	}
+	return s.substring(start,start+ws);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec22/board_path.java b/Crux_Live_Jan22/src/Lec22/board_path.java
new file mode 100644
index 0000000..371ad44
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/board_path.java
@@ -0,0 +1,31 @@
+package Lec22;
+
+public class board_path {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=4;
+		System.out.println("\n"+boardpath(n,0,""));
+	}
+public static int boardpath(int end,int curr,String ans)
+{
+	if(curr==end) {
+		System.out.println(ans+"");
+		return 1;
+	}
+	if(curr>end)
+	{
+		return 0;
+	}
+	//int fp = boardpath(end,curr+1,ans+1);
+	//int sp = boardpath(end,curr+2,ans+2);
+	//int tp = boardpath(end,curr+3,ans+3);
+	//return fp+sp+tp;
+	int count=0;
+	for(int i=1;i<=3;i++)
+	{
+		count = count+boardpath(end,curr+i,ans+i);
+	}
+	return count;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec22/cointoss.java b/Crux_Live_Jan22/src/Lec22/cointoss.java
new file mode 100644
index 0000000..60b6ded
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/cointoss.java
@@ -0,0 +1,22 @@
+package Lec22;
+
+public class cointoss {
+     static int count = 0;
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n = 3;
+		cointoss(n,"");
+		System.out.println(count);
+	}
+public static void cointoss(int n,String ans)
+{
+	if(n==0) {
+		System.out.println(ans);
+		count++;
+		return ;
+	}
+	cointoss(n-1,ans+"H");
+	cointoss(n-1,ans+"T");
+	
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec22/cointoss_without_two_head.java b/Crux_Live_Jan22/src/Lec22/cointoss_without_two_head.java
new file mode 100644
index 0000000..1b8d730
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/cointoss_without_two_head.java
@@ -0,0 +1,26 @@
+package Lec22;
+
+public class cointoss_without_two_head {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=3;
+		cointoss(n,"");
+	}
+public static void cointoss(int n,String ans)
+{
+	if(n==0)
+	{
+		System.out.println(ans);
+		return ;		
+	}
+	if(ans.length()==0 || ans.charAt(ans.length()-1)!= 'H')//without two head
+	{
+		cointoss(n-1,ans + "H");
+	}
+	if(ans.length()==0 || ans.charAt(ans.length()-1)!= 'T')//without two tail
+	{
+		cointoss(n-1,ans + "T");
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec22/count_subsequence.java b/Crux_Live_Jan22/src/Lec22/count_subsequence.java
new file mode 100644
index 0000000..ed529ed
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/count_subsequence.java
@@ -0,0 +1,40 @@
+package Lec22;
+
+public class count_subsequence {
+         static int count=0;
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		String str = "abc";
+		//	System.out.print("\n"+printsubseq(str,""));
+		//printsubseq(str,"");
+		//System.out.println(count);
+		System.out.println(printsubseq1(str,""));
+		}
+
+
+		public static void printsubseq(String ques,String ans)//using static variable
+		{
+			if(ques.length()==0)
+			{
+				System.out.println(ans);
+				count++;
+				return;
+			}
+			char ch = ques.charAt(0);
+		 printsubseq(ques.substring(1),ans);
+		  printsubseq(ques.substring(1),ans+ch);
+		}
+		//2nd way
+		public static int printsubseq1(String ques,String ans) {
+			if(ques.length()==0) {
+				System.out.println(ans);
+			
+		return 1;
+			}
+			char ch = ques.charAt(0);
+			int f1 = printsubseq1(ques.substring(1),ans);
+			int f2 = printsubseq1(ques.substring(1),ans+ch);
+			return f1+f2;
+		}
+	}
diff --git a/Crux_Live_Jan22/src/Lec22/dice_roll.java b/Crux_Live_Jan22/src/Lec22/dice_roll.java
new file mode 100644
index 0000000..ba368d4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/dice_roll.java
@@ -0,0 +1,28 @@
+package Lec22;
+
+public class dice_roll {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=6;
+		System.out.println("\n"+diceroll(n,0,""));
+		
+	}
+public static int diceroll(int end,int curr,String ans)
+{
+	if(curr==end)
+	{
+		System.out.println(ans+"");
+		return 1;
+	}
+	if(curr>end) {
+		return 0;
+	}
+	int count=0;
+	for(int dice=1;dice<=6;dice++)
+	{
+		count = count+diceroll(end,curr+dice,ans+dice);
+	}
+	return count;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec22/generate_parenthesis.java b/Crux_Live_Jan22/src/Lec22/generate_parenthesis.java
new file mode 100644
index 0000000..f66c6dc
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec22/generate_parenthesis.java
@@ -0,0 +1,29 @@
+ package Lec22;
+import java.util.*;
+public class generate_parenthesis {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        int n=3;
+        //parenthesis( n,0, 0,"");
+        List<String>list = new ArrayList<>();
+        parenthesis( n,0, 0,"",list);
+        System.out.println(list);
+        
+	}
+public static void parenthesis(int n,int opening,int closing,String ans,List<String>list)
+{ 
+	if(opening == n && closing == n) {
+		
+		//System.out.println(ans);
+		list.add(ans);
+		return;
+	}
+	if(opening<n) {
+		parenthesis(n,opening+1,closing,ans+"(",list);
+	}
+	if(closing<opening) {
+		parenthesis(n,opening,closing+1,ans+")",list);
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec23/Dublicate_permutation.java b/Crux_Live_Jan22/src/Lec23/Dublicate_permutation.java
new file mode 100644
index 0000000..94418ff
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec23/Dublicate_permutation.java
@@ -0,0 +1,32 @@
+package Lec23;
+
+public class Dublicate_permutation {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		// TODO Auto-generated method stub
+				String s = "abca";
+				printpermutation(s,"");
+			}
+		public static void printpermutation(String ques,String ans)
+		{    
+			if(ques.length()==0) {
+				System.out.println(ans);
+				return ;
+			}
+			for(int i=0;i<ques.length();i++)
+			{	char ch = ques.charAt(i);
+				boolean flag = true;
+				for(int j=i+1;j<ques.length();j++) {
+					if(ques.charAt(j)==ch) {
+						flag =false;
+						break;
+					}
+				}
+				if(flag==true) {
+				String ros = ques.substring(0,i)+ques.substring(i+1);
+				printpermutation(ros,ans+ch);}
+			}
+		}
+		}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec23/Maze_path.java b/Crux_Live_Jan22/src/Lec23/Maze_path.java
new file mode 100644
index 0000000..7a895aa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec23/Maze_path.java
@@ -0,0 +1,23 @@
+package Lec23;
+
+public class Maze_path {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int m=4;
+		int n =5;
+		printpath(m-1,n-1,0,0,"");
+	}
+public static void  printpath(int er,int ec,int cr,int cc,String ans) {
+	//er = end row,ec = end column,cc = curr column,cr = curr row
+	if(cc == ec && cr ==er) {
+		System.out.println(ans+" ");
+		return;
+	}
+	if(cc>ec || cr>er) {
+		return;
+	}
+	printpath(er,ec,cr,cc+1,ans+"H");
+	printpath(er,ec,cr+1,cc,ans+"V");
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec23/key_pad.java b/Crux_Live_Jan22/src/Lec23/key_pad.java
new file mode 100644
index 0000000..0e5796a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec23/key_pad.java
@@ -0,0 +1,24 @@
+package Lec23;
+
+public class key_pad {
+  static String[]key = {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+       String str="12";
+       printkeypad(str,"");
+	}
+public static void printkeypad(String ques,String ans)
+{
+	if(ques.length()==0)
+	{
+		System.out.print(ans+" ");
+		return;
+	}
+	char ch = ques.charAt(0);
+	String pressString  = key[ch-48];
+	for(int i=0;i<pressString.length();i++)
+	{
+		printkeypad(ques.substring(1),ans+pressString.charAt(i));
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec23/permutation.java b/Crux_Live_Jan22/src/Lec23/permutation.java
new file mode 100644
index 0000000..d95437f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec23/permutation.java
@@ -0,0 +1,23 @@
+package Lec23;
+
+public class permutation {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String s = "abc";
+		printpermutation(s,"");
+	}
+public static void printpermutation(String ques,String ans)
+{    
+	if(ques.length()==0) {
+		System.out.println(ans);
+		return ;
+	}
+	for(int i=0;i<ques.length();i++)
+	{
+		String ros = ques.substring(0,i)+ques.substring(i+1);
+		char ch = ques.charAt(i);
+		printpermutation(ros,ans+ch);
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec25/Lexico_counting.java b/Crux_Live_Jan22/src/Lec25/Lexico_counting.java
new file mode 100644
index 0000000..b94650e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec25/Lexico_counting.java
@@ -0,0 +1,27 @@
+package Lec25;
+
+public class Lexico_counting {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+       int n = 1000;
+       printcount(0,n);
+	}
+public static void printcount(int curr,int end)
+{
+	if(curr>end)
+	{
+		return;
+	}
+	System.out.println(curr);
+		int i=0;
+		if(curr==0)
+		{
+			i=1;
+		}
+		for(;i<=9;i++)
+		{
+			printcount(curr*10+i,end);
+		}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec25/Tower_of_hanoi.java b/Crux_Live_Jan22/src/Lec25/Tower_of_hanoi.java
new file mode 100644
index 0000000..68bb1bb
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec25/Tower_of_hanoi.java
@@ -0,0 +1,23 @@
+package Lec25;
+
+public class Tower_of_hanoi {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int n=5;
+		printstep(n,"A","B","C");
+	}
+
+	public static void printstep(int n, String s, String h,String d) {
+		// TODO Auto-generated method stub
+		//s-->source h-->helper d-->destination
+	if(n==0)
+	{
+		return ;
+	}
+	printstep(n-1,s,d,h);
+	System.out.println("Move "+n+"th from "+s+" to "+d);
+	printstep(n-1,h,s,d);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec26/queen_combination.java b/Crux_Live_Jan22/src/Lec26/queen_combination.java
new file mode 100644
index 0000000..ed6eb4f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec26/queen_combination.java
@@ -0,0 +1,29 @@
+package Lec26;
+
+public class queen_combination {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		boolean[] board = new boolean[4];
+		int n=2;
+		queen(board,n,0,"",0);
+	}
+public static void queen(boolean[] board,int tq,int qpsf,String ans,int idx) {
+	//tq-->total queen 
+	//qpsf-->queen place so far
+	if(tq==qpsf)
+	{
+		System.out.println(ans);
+		return;
+	}
+	for(int i=idx;i<board.length;i++)
+	{
+		if(board[i]==false) {//queen place nhi hai
+			board[i]=true;
+			queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
+		    board[i]=false;
+		}
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec26/queen_permuitation.java b/Crux_Live_Jan22/src/Lec26/queen_permuitation.java
new file mode 100644
index 0000000..b117923
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec26/queen_permuitation.java
@@ -0,0 +1,28 @@
+package Lec26;
+
+public class queen_permuitation {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		boolean[] board = new boolean[4];
+		int n=2;
+		queen(board,n,0,"");
+	}
+public static void queen(boolean[] board,int tq,int qpsf,String ans) {
+	//tq-->total queen 
+	//qpsf-->queen place so far
+	if(tq==qpsf)
+	{
+		System.out.println(ans);
+		return;
+	}
+	for(int i=0;i<board.length;i++)
+	{
+		if(board[i]==false) {//queen place nhi hai
+			board[i]=true;
+			queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
+		    board[i]=false;
+		}
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec27/coin_combination.java b/Crux_Live_Jan22/src/Lec27/coin_combination.java
new file mode 100644
index 0000000..ee49163
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec27/coin_combination.java
@@ -0,0 +1,26 @@
+package Lec27;
+
+public class coin_combination {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[] coin = {2,3,5,6};
+		int amount = 10;
+		printcombination(coin,amount,"",0);
+	}
+public static void printcombination(int[]coin,int amount,String ans,int idx)
+{
+	if(amount==0)
+	{
+		System.out.println(ans);
+		return;
+	}
+	for(int i=idx;i<=coin.length;i++)
+	{
+		if(amount>=coin[i])
+		{
+			printcombination(coin,amount-coin[i],ans+coin[i],i);
+		}
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec27/coin_permuation.java b/Crux_Live_Jan22/src/Lec27/coin_permuation.java
new file mode 100644
index 0000000..b8d4849
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec27/coin_permuation.java
@@ -0,0 +1,25 @@
+package Lec27;
+
+public class coin_permuation {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int [] coin  = {2,3,5,6};
+		int amount=10;
+		printpermutation(coin,amount,"");
+	}
+public static void printpermutation(int[]coin ,int amount,String ans) {
+	if(amount==0)
+	{
+		System.out.println(ans);
+		return;
+	}
+	for(int i=0;i<coin.length;i++)
+	{
+		if(amount>=coin[i])
+		{
+			printpermutation(coin,amount-coin[i],ans+coin[i]);
+		}
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec28/combination_leetcode77.java b/Crux_Live_Jan22/src/Lec28/combination_leetcode77.java
new file mode 100644
index 0000000..53ab8aa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec28/combination_leetcode77.java
@@ -0,0 +1,37 @@
+package Lec28;
+
+import java.util.ArrayList;
+import java.util.List;
+
+public class combination_leetcode77 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		boolean[] board = new boolean[4];
+		int n=2;
+		List<Integer>ll= new ArrayList<>();
+	    List<List<Integer>>ans = new ArrayList<>();
+		queen(board,n,0,0,ll,ans);
+		System.out.println(ans);
+	}
+	public static void queen(boolean[] board,int tq,int qpsf,int idx,List<Integer>ll,List<List<Integer>>ans) {
+		//tq-->total queen 
+		//qpsf-->queen place so far
+		if(tq==qpsf)
+		{
+			//System.out.println();
+			ans.add(new ArrayList<>(ll));
+			return;
+		}
+		for(int i=idx;i<board.length;i++)
+		{
+			if(board[i]==false) {//queen place nhi hai
+				board[i]=true;
+				ll.add(i+1);
+				queen(board,tq,qpsf+1,i+1,ll,ans);
+				ll.remove(ll.size()-1);
+			    board[i]=false;
+			}
+		}
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec28/combination_sum2.java b/Crux_Live_Jan22/src/Lec28/combination_sum2.java
new file mode 100644
index 0000000..bcba5e5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec28/combination_sum2.java
@@ -0,0 +1,39 @@
+package Lec28;
+import java.util.List;
+import java.util.ArrayList;
+import java.util.Arrays;
+
+public class combination_sum2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		 int[] arr = {10,1,2,7,6,1,5};
+		 int target = 8;
+		 Arrays.sort(arr);
+		List<Integer>ll= new ArrayList<>();
+	     List<List<Integer>>ans = new ArrayList<>();
+		printcombination(arr,target,ll,0,ans);
+        System.out.println(ans);
+	}
+	 public static void printcombination(int[]arr,int amount,List<Integer>ll,int idx, List<List<Integer>>ans)
+		{
+			if(amount==0)
+			{
+				//System.out.println(ll);
+				ans.add(new ArrayList<>(ll));
+				return;
+			}
+			for(int i=idx;i<arr.length;i++)
+			{
+				if(i!=idx && arr[i]==arr[i-1]) {
+					continue;
+				}
+				if(amount>=arr[i])
+				{
+					ll.add(arr[i]);
+					printcombination(arr,amount-arr[i],ll,i+1,ans);
+					ll.remove(ll.size()-1);
+				}
+			}
+		}
+}
diff --git a/Crux_Live_Jan22/src/Lec28/combination_sum3.java b/Crux_Live_Jan22/src/Lec28/combination_sum3.java
new file mode 100644
index 0000000..3bdde4a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec28/combination_sum3.java
@@ -0,0 +1,42 @@
+package Lec28;
+
+import java.util.ArrayList;
+import java.util.List;
+
+public class combination_sum3 {
+
+	public static void main(String[] args) {
+
+	
+				// TODO Auto-generated method stub
+				 int[] arr = {1,2,3,4,5,6,7,8,9};
+				 int target = 7;
+				 int sum=3;
+				List<Integer>ll= new ArrayList<>();
+			     List<List<Integer>>ans = new ArrayList<>();
+				printcombination(arr,target,ll,0,ans,sum);
+		        System.out.println(ans);
+			}
+			 public static void printcombination(int[]arr,int amount,List<Integer>ll,int idx, List<List<Integer>>ans,int sum)
+				{
+				
+					if(amount==0 && sum==0)
+					{
+						//System.out.println(ll);
+						ans.add(new ArrayList<>(ll));
+						return;
+					}
+					for(int i=idx;i<arr.length;i++)
+					{
+						if(i!=idx && arr[i]==arr[i-1]) {
+							continue;
+						}
+						if(amount>=arr[i])
+						{
+							ll.add(arr[i]);
+							printcombination(arr,amount-arr[i],ll,i+1,ans,sum-1);
+							ll.remove(ll.size()-1);
+						}
+					}
+				}
+		}
diff --git a/Crux_Live_Jan22/src/Lec28/combination_sum_leetcode.java b/Crux_Live_Jan22/src/Lec28/combination_sum_leetcode.java
new file mode 100644
index 0000000..557fe15
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec28/combination_sum_leetcode.java
@@ -0,0 +1,34 @@
+package Lec28;
+
+import java.util.ArrayList;
+import java.util.List;
+
+public class combination_sum_leetcode {
+	public static void main(String[] args)
+	{
+		int[] arr = {2,3,6,7};
+		int amount = 7;
+	     List<Integer>ll= new ArrayList<>();
+	     List<List<Integer>>ans = new ArrayList<>();
+		printcombination(arr,amount,ll,0,ans);
+		System.out.println(ans);
+	}
+	public static void printcombination(int[]arr,int amount,List<Integer>ll,int idx, List<List<Integer>>ans)
+	{
+		if(amount==0)
+		{
+			//System.out.println(ll);
+			ans.add(new ArrayList<>(ll));
+			return;
+		}
+		for(int i=idx;i<arr.length;i++)
+		{
+			if(amount>=arr[i])
+			{
+				ll.add(arr[i]);
+				printcombination(arr,amount-arr[i],ll,i,ans);
+				ll.remove(ll.size()-1);
+			}
+		}
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec28/subset_78leetcode.java b/Crux_Live_Jan22/src/Lec28/subset_78leetcode.java
new file mode 100644
index 0000000..1ef8536
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec28/subset_78leetcode.java
@@ -0,0 +1,29 @@
+package Lec28;
+
+import java.util.ArrayList;
+import java.util.List;
+
+public class subset_78leetcode {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int []arr = {1,2,3};
+		List<Integer>ll= new ArrayList<>();
+	    List<List<Integer>>ans = new ArrayList<>();
+		subset(arr,0,ll,ans);
+		System.out.println(ans);
+		
+	}
+public static void subset(int[]arr,int i,List<Integer>ll,List<List<Integer>>ans)
+{
+	if(i==arr.length)
+	{
+		ans.add(new ArrayList<Integer>(ll));
+		return;
+	}
+	subset(arr,i+1,ll,ans);
+	ll.add(arr[i]);
+	subset(arr,i+1,ll,ans);
+	ll.remove(ll.size()-1);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec29/palindrome_partitioning.java b/Crux_Live_Jan22/src/Lec29/palindrome_partitioning.java
new file mode 100644
index 0000000..927e508
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec29/palindrome_partitioning.java
@@ -0,0 +1,47 @@
+package Lec29;
+
+import java.util.ArrayList;
+import java.util.List;
+
+public class palindrome_partitioning {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		List<String>list = new ArrayList<>();
+		List<List<String>> ans = new ArrayList<>();
+		String str = "nitin";
+		palindrome_partitioning(str,list,ans);
+		System.out.println(ans);
+				
+	}
+	public static void palindrome_partitioning(String ques,List<String>list,List<List<String>>ans) {
+		if(ques.length()==0)
+		{
+			//System.out.println(ans);
+		   ans.add(new ArrayList<String>(list));
+		}
+		for(int i=1;i<=ques.length();i++)
+		{
+			String s = ques.substring(0,i);
+			if(ispalindrome(s)) {
+				list.add(s);
+			palindrome_partitioning(ques.substring(i),list,ans);
+			list.remove(list.size()-1);
+			}
+		}
+	}
+	public static boolean ispalindrome(String s)
+	{
+		int i=0;
+		int j = s.length()-1;
+		while(i<j)
+		{
+			if(s.charAt(i)!=s.charAt(j)) {
+				return false;
+			}
+			i++;
+			j--;
+		}
+		return true;
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec29/string_partitioning.java b/Crux_Live_Jan22/src/Lec29/string_partitioning.java
new file mode 100644
index 0000000..40e844c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec29/string_partitioning.java
@@ -0,0 +1,23 @@
+package Lec29;
+
+public class string_partitioning {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		String str = "nitin";
+		String ans="";
+		string_partitioning(str,ans);
+	}
+public static void string_partitioning(String ques,String ans) {
+	if(ques.length()==0)
+	{
+		System.out.println(ans);
+	
+	}
+	for(int i=1;i<=ques.length();i++)
+	{
+		string_partitioning(ques.substring(i),ans+ques.substring(0,i)+"|");
+		
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec29/word_search.java b/Crux_Live_Jan22/src/Lec29/word_search.java
new file mode 100644
index 0000000..e6d91ca
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec29/word_search.java
@@ -0,0 +1,42 @@
+package Lec29;
+
+public class word_search {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		char[][] maze = {{'A','B','C','D','E'},{'S','F','C','S'},{'A','D','E','E'}};
+		String word = "ABCCED";
+		for(int i=0;i<maze[0].length;i++) {
+			for(int j=0;j<maze[0].length;j++)
+			{
+				if(maze[i][j]==word.charAt(0)) {
+					boolean ans = findword(maze,i,j,word,0);
+					if(ans==true) {
+						System.out.println(ans);
+						return;
+					}
+				}
+			}
+		}
+		System.out.println(false);
+	}
+public static boolean findword(char[][] maze,int cr,int cc,String word,int idx) {
+	if(idx==word.length()) {
+		return true; 
+	}
+	if(cc<0||cc>=maze[0].length||cr<0||cr>=maze.length || maze[cr][cc]!=word.charAt(idx)) {
+		return false;
+	}
+	int[]r = {-1,1,0,0};
+	int[]c = {0,0,1,-1};
+	maze[cr][cc]='*';
+	for(int i=0;i<c.length;i++) {
+		boolean ans = findword(maze,cr +r[i],cc+c[i],word,idx+1);
+		if(ans==true) {
+			return ans;
+		}
+	}
+	maze[cr][cc] = word.charAt(idx);
+	return false;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec3/HollowDiamond.java b/Crux_Live_Jan22/src/Lec3/HollowDiamond.java
new file mode 100644
index 0000000..83a7917
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/HollowDiamond.java
@@ -0,0 +1,31 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class HollowDiamond {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+       Scanner sc = new Scanner(System.in);
+       int n = sc.nextInt();
+       int i;
+       int j;
+       int c1 = (n-1)/2;
+       int c2 = 3*n/2-1;
+       for(i = 0;i<n;i++)
+       {
+    	   for(j=0;j<n;j++)
+    	   {
+    		   if(i+j<=c1||i-j>=c1||j-i>=c1||i+j>=c2)
+    		   {
+    			   System.out.print("*"+"\t");
+    		   }
+    		   else
+    		   {
+    			   System.out.print(" "+"\t");
+    		   }
+    	   }
+    	   System.out.println();
+       }}}
+       
+
diff --git a/Crux_Live_Jan22/src/Lec3/MirrorStarPattern.java b/Crux_Live_Jan22/src/Lec3/MirrorStarPattern.java
new file mode 100644
index 0000000..f055b0a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/MirrorStarPattern.java
@@ -0,0 +1,97 @@
+package Lec3;
+
+//Java Program to Print Mirror upper Star triangle Pattern
+
+//Importing input output classes
+import java.util.*;
+
+//Main Class
+public class MirrorStarPattern {
+
+	// Method 1
+	// To print upper part of the pattern
+	private static void displayUpperPart(int n)
+	{
+
+		// Declaring variables for rows and columns
+		// respectively
+		int m, c;
+
+		// Outer loop for rows
+		for (m = n - 1; m >= 0; m--) {
+
+			// Inner loop 1
+			for (c = 0; n < m; c++) {
+
+				// Printing whitespace
+				System.out.print(" ");
+			}
+
+			// Inner loop 2
+			for (c = m; n <= n - 1; c++) {
+
+				// Printing star with whitespace
+				System.out.print("*"
+								+ " ");
+			}
+
+			// By now we are done with one row so new line
+			System.out.println();
+		}
+	}
+
+	// Method 2
+	// To print lower part of the pattern
+	private static void displayLowerPart(int n)
+	{
+
+		// Declaring variables for rows and columns
+		// respectively
+		int m, c;
+
+		// Outer loop for rows
+		for (m = 1; m <= n; m++) {
+
+			// Inner loop 1
+			for (c = 1; n < m; c++) {
+
+				// Printing whitespace
+				System.out.print(" ");
+			}
+
+			// Inner loop 2
+			for (c = m; n <= n; c++) {
+
+				// Printing star and whitespace
+				System.out.print("*"
+								+ " ");
+			}
+
+			// By now we are done with one row so new line
+			System.out.println();
+		}
+	}
+
+	// Method 3
+	// Main driver method
+	public static void main(String[] args)
+	{
+		// Declaring and initializing variable to
+		// size of the triangle
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+
+		// Calling Method 1 to
+		// display the upper part
+		displayUpperPart(n);
+
+		// Calling Method 2 to
+		// display lower part
+		displayLowerPart(n);
+	}
+}
+
+
+	
+
+
diff --git a/Crux_Live_Jan22/src/Lec3/MirrorStarPattern1.java b/Crux_Live_Jan22/src/Lec3/MirrorStarPattern1.java
new file mode 100644
index 0000000..b1e5dfa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/MirrorStarPattern1.java
@@ -0,0 +1,42 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class MirrorStarPattern1 {
+	 public static void main(String args[]) {
+	        Scanner sc = new Scanner(System.in);
+	        int n = sc.nextInt();
+	        int row = 1;
+	        int star = 1;
+	        int space = n/2;//intial number of spaces should be n/2
+	        while(row<=n)
+	        {
+	            int i = 1;
+	            while(i<=space)
+	            {
+	                System.out.print("\t");
+	                i = i+1;
+	            }
+	            int j = 1;
+	            
+	            while(j<=star)
+	            {
+	                System.out.print("*"+"\t");
+	                j = j+1;
+	            }
+	                if(row<=n/2)
+	                {
+	                    star = star+2;
+	                    row = row+1;
+	                    space = space-1;
+	                }
+	                else
+	                {
+	                    star = star-2;
+	                    row = row+1;
+	                    space = space+1;
+	                }
+	                System.out.println();
+	        }
+	    }
+	}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec3/PascalTriangle.java b/Crux_Live_Jan22/src/Lec3/PascalTriangle.java
new file mode 100644
index 0000000..992bc4b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/PascalTriangle.java
@@ -0,0 +1,36 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class PascalTriangle {
+
+	    public static void main(String args[]) {
+	 Scanner sc = new Scanner(System.in);
+	         int n = sc.nextInt();
+	         int i=0;
+	         int k=1;
+	         if(n<0 || n>100)
+	         { System.out.print("error");
+	         }
+	         else
+	         {
+	             while(i<n)
+	             {
+	                 int j=0;
+	                 while(j<=i)
+	                 {
+	                     if(j==0 || i==0)
+	                     { k=1;
+	                     }
+	                     else
+	                     { k=k*(i-j+1)/j;
+	                     }
+	                     System.out.print(k+"\t");
+	                     j++;
+	                 }
+	                 i++;
+	                 System.out.println();
+	             }
+	         }
+	    }
+	}
diff --git a/Crux_Live_Jan22/src/Lec3/PatternRhombus.java b/Crux_Live_Jan22/src/Lec3/PatternRhombus.java
new file mode 100644
index 0000000..90ac84d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/PatternRhombus.java
@@ -0,0 +1,57 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class PatternRhombus {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();		
+		int row = 1;
+		int star = 1;
+		int val =1;
+		int space = n-1;
+		while(row<=2*n-1)
+		{
+			int i = 1;
+			while(i<=space)
+			{
+				System.out.print("\t");
+				i = i+1;
+			}
+			int j = 1;
+			int val1 = val;
+			while(j<=star)
+			{
+				System.out.print(val1+"\t");
+				if(j<=star/2)
+				{
+					val1=val1+1;
+				}
+				else
+				{
+					val1 = val1-1;
+				}
+				j = j+1;
+			}   if(row<n){
+				star = star+2;
+				space = space-1;
+				val=val+1;}
+				else
+				{
+					star = star-2;
+			        space = space+1;
+			        val = val-1;
+				}
+				
+				row = row+1;
+				System.out.println();
+		}
+		
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec3/PatternTriangle.java b/Crux_Live_Jan22/src/Lec3/PatternTriangle.java
new file mode 100644
index 0000000..3d0bbab
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/PatternTriangle.java
@@ -0,0 +1,46 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class PatternTriangle {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();		
+		int row = 1;
+		int star = 1;
+		int space = n-1;
+		while(row<=n)
+		{
+			int i = 1;
+			while(i<=space)
+			{
+				System.out.print("     ");
+				i = i+1;
+			}
+			int j = 1;
+			int val = row;
+			while(j<=star)
+			{
+				System.out.print(val+"    ");
+				if(j<(star/2)+1)
+				{
+					val = val+1;
+				}
+				else
+				{
+					val = val-1;
+				}
+				j = j+1;
+			}
+				star = star+2;
+				space = space-1;
+				row = row+1;
+				System.out.println();
+		}
+		
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec3/Patternnumberladder.java b/Crux_Live_Jan22/src/Lec3/Patternnumberladder.java
new file mode 100644
index 0000000..6f6cc17
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/Patternnumberladder.java
@@ -0,0 +1,26 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class Patternnumberladder {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method s
+
+		  Scanner sc = new Scanner(System. in );
+
+
+		    int n = sc.nextInt();
+
+		    int num = 1;
+
+		    for (int i = 1; i <= n; i++) {
+
+		      for (int j = 1; j <= i; j++) {
+
+		        System.out.print(num+++" ");
+		      }
+		      System.out.println();
+		    }
+		  }
+		}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec3/Patternwithzeros.java b/Crux_Live_Jan22/src/Lec3/Patternwithzeros.java
new file mode 100644
index 0000000..b76257d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec3/Patternwithzeros.java
@@ -0,0 +1,29 @@
+package Lec3;
+
+import java.util.Scanner;
+
+public class Patternwithzeros {
+    public static void main(String[] args) {
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		
+		int row = 1;
+		while(row<=n)
+		{
+	           int i=1;
+				while(i<=row)
+					{   if(i==1||i==row) {
+						System.out.print(row+"\t");}
+					else {
+						System.out.print("0"+"\t");
+					}
+						i++;
+				}
+		
+				row = row+1;
+				System.out.println();
+		}
+				
+				
+	}}
+
diff --git a/Crux_Live_Jan22/src/Lec31/stringbuilder_demo.java b/Crux_Live_Jan22/src/Lec31/stringbuilder_demo.java
new file mode 100644
index 0000000..476a825
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec31/stringbuilder_demo.java
@@ -0,0 +1,16 @@
+package Lec31;
+
+public class stringbuilder_demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		StringBuilder sb = new StringBuilder();
+		sb.append("Hello");
+		System.out.println(sb);
+		System.out.println(sb.length());
+		System.out.println(sb.reverse());
+		System.out.println(sb.capacity());
+		
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec32/merge_sort.java b/Crux_Live_Jan22/src/Lec32/merge_sort.java
new file mode 100644
index 0000000..74cf85a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec32/merge_sort.java
@@ -0,0 +1,63 @@
+package Lec32;
+
+public class merge_sort {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[]arr = {7,3,2,1,5,7,1};
+		int[]ans = mergesort(arr,0,arr.length-1);
+		for(int i=0;i<ans.length;i++)
+		{
+			System.out.print(ans[i]+" ");
+		}
+}
+	public static int[]  mergesort(int[]arr,int lo,int hi)
+	{
+		if(lo==hi)
+		{
+			int[]a = new int[1];
+			a[0]=arr[lo];
+			return a;
+		}
+	int mid = (lo+hi)/2;
+	int[]fs = mergesort(arr,lo,mid);
+	int[]ss = mergesort(arr,mid+1,hi);
+	return mergesorted_array(fs,ss);
+ 		
+	}
+	private static int[] mergesorted_array(int[] fs, int[] ss) {
+		// TODO Auto-generated method stub
+		int n  = fs.length;
+		int m=  ss.length;
+		int[]ans = new int[n+m];
+		int i=0;
+		int j=0;
+		int k=0;
+		while(i<n && j<m)
+		{
+			if(fs[i]<=ss[j])
+			{
+				ans[k]=fs[i];
+				i++;
+				k++;
+			}
+			else {
+				ans[k]=ss[j];
+				j++;
+				k++;
+			}}
+			while(i<n)
+			{
+				ans[k]=fs[i];
+				i++;
+				k++;
+			}
+			while(j<m)
+			{
+				ans[k]=ss[j];
+				j++;
+				k++;
+			}
+		return ans;
+		
+}}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec35/Student.java b/Crux_Live_Jan22/src/Lec35/Student.java
new file mode 100644
index 0000000..e1b00d6
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec35/Student.java
@@ -0,0 +1,9 @@
+package Lec35;
+
+public class Student {
+   String name;
+   int age;
+   public void indroduce_yourself() {
+	   System.out.println("my name is "+name+ " and age is "+age);
+   }
+}
diff --git a/Crux_Live_Jan22/src/Lec35/Student_client.java b/Crux_Live_Jan22/src/Lec35/Student_client.java
new file mode 100644
index 0000000..b775d46
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec35/Student_client.java
@@ -0,0 +1,22 @@
+package Lec35;
+
+
+public class Student_client {
+	public static void main(String[] args) {
+		Student s = new Student();
+		s.name="ramu";
+		s.age=90;
+		System.out.println(s.name);
+		System.out.println(s.age);
+	
+		Student s1 = new Student();
+		s1.name="raj";
+		s1.age=20;
+		System.out.println(s1.name);
+		System.out.println(s1.age);
+		s.indroduce_yourself();
+		s1.indroduce_yourself();
+	}
+		
+ 
+}
diff --git a/Crux_Live_Jan22/src/Lec36/client_student.java b/Crux_Live_Jan22/src/Lec36/client_student.java
new file mode 100644
index 0000000..63d8750
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec36/client_student.java
@@ -0,0 +1,13 @@
+package Lec36;
+
+public class client_student {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		student s = new student("rajma",23);
+		s.setName("kumar");
+	//	s.setAge(-2);
+		System.out.println(s.getAge() +" "+s.getName());
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec36/person.java b/Crux_Live_Jan22/src/Lec36/person.java
new file mode 100644
index 0000000..e53102a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec36/person.java
@@ -0,0 +1,22 @@
+package Lec36;
+
+public class person {
+	String name;
+	int age;
+	//constructor
+	//public person() {//non parametrized constructor
+	//this.name="motu";
+	//this.age=24;
+	//}
+	public person() {};//default constructor
+	//public person(String name,int age) {//parametrized constructor
+    //this.name="motu";
+   // this.age=24;
+	//}
+	
+	public void fun()
+	{
+		int adhar_no = 901928;
+		System.out.println(this.name+" "+this.age+" "+adhar_no);;
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec36/person_client.java b/Crux_Live_Jan22/src/Lec36/person_client.java
new file mode 100644
index 0000000..f821831
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec36/person_client.java
@@ -0,0 +1,18 @@
+package Lec36;
+
+public class person_client {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		person p = new person();
+		p.name="kaju";
+		p.age=23;
+		p.fun();
+		person p1 = new person();
+		p1.name="kunal";
+		p1.age=45;
+		p1.fun();
+	
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec36/student.java b/Crux_Live_Jan22/src/Lec36/student.java
new file mode 100644
index 0000000..ab94fef
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec36/student.java
@@ -0,0 +1,39 @@
+package Lec36;
+
+public class student {
+	private String name = "kriti";
+	private int age = 80;
+	public student(String name,int age) {
+		this.age = age;
+		this.name=name;
+	}
+	public String getName() {
+		return name;
+	}
+	public void setName(String name) {
+		this.name = name;
+	}
+	public int getAge() {
+		return age;
+	}
+	//public void setAge1(int age)throws Exception{
+	//	if(age<0) {
+	//		throw new Exception("pgl hai age negative nhi hota");
+	//	}
+		//this.age = age;
+	//}
+	public void setAge(int age) {
+		try {
+			if(age<0) {
+				throw new Exception("pgl hai kya age negative nhi hota");
+			}
+			this.age=age;
+		}
+		catch(Exception e) {
+			e.printStackTrace();
+		}
+		finally {
+			System.out.println(getName());
+		}
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec37/queue.java b/Crux_Live_Jan22/src/Lec37/queue.java
new file mode 100644
index 0000000..c616f6c
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec37/queue.java
@@ -0,0 +1,53 @@
+package Lec37;
+
+public class queue {
+	protected int[] data ;
+	protected int front=0;
+	protected int size=0; //queue ka size btega
+	
+	public queue() {
+		this.data= new int[5];
+	}
+	public queue(int cap) {
+		this.data = new int[cap];
+	}
+	public boolean isEmpty() {
+		return this.size==0;
+	}
+	public boolean isFull() {
+		return this.size == this.data.length;
+	}
+	public int size() {
+		return this.size;
+	}
+	public void Enqueue(int item) throws Exception {
+		if(isFull()){
+			throw new Exception("queue khali hai");
+		}
+		int i = (this.size+this.front)%this.data.length;
+		this.data[i]=item;
+		this.size++;
+	}
+	public int dequeue() throws Exception {
+		if(isEmpty()){
+			throw new Exception("queue full hai");
+		}
+		int rv = this.data[this.front];
+		this.front=(this.front+1)%this.data.length;
+		this.size--;
+		return rv; 
+	}
+	public int getfront() throws Exception {
+		if(isEmpty()){
+			throw new Exception("queue khali hai");
+		}
+		return this.data[this.front];
+	}
+	public void Display() {
+		for(int i=0;i<this.size;i++) {
+			int idx=(this.front+i)%this.data.length;
+			System.out.print(this.data[idx]+" ");
+		}
+		System.out.println();
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec37/queue_client.java b/Crux_Live_Jan22/src/Lec37/queue_client.java
new file mode 100644
index 0000000..c6cf3d8
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec37/queue_client.java
@@ -0,0 +1,22 @@
+package Lec37;
+
+public class queue_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		queue qq = new queue();
+		qq.Enqueue(10);
+		qq.Enqueue(20);
+		qq.Enqueue(30);
+		qq.Enqueue(40);
+		qq.Display();
+		System.out.println(qq.dequeue());
+		System.out.println(qq.dequeue());
+		qq.Display();
+		qq.Enqueue(50);
+		qq.Enqueue(60);
+		qq.Enqueue(70);
+		qq.Display();
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec37/stack.java b/Crux_Live_Jan22/src/Lec37/stack.java
new file mode 100644
index 0000000..4a72538
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec37/stack.java
@@ -0,0 +1,47 @@
+package Lec37;
+
+public class stack {
+	protected int[]data;
+	protected int top=0;
+	 public stack() {
+		 this.data = new int[5];
+	 }
+	public stack(int cap) {
+	 this.data=new int[cap];
+	 }
+	 public boolean isEmpty() {
+		 return top==0;
+	 }
+	 public boolean isfull() {
+		 return top==this.data.length;
+	 }
+	 public void push(int item) throws Exception {
+		 if(isfull()) {
+			 throw new Exception("sun be stack full hogya");
+		 }
+		 this.data[this.top]=item;
+		 this.top++;
+	 }
+	 public int pop() throws Exception {
+		 if(isEmpty()) {
+			 throw new Exception("sun be stack empty hai");
+		 }
+		 this.top--;
+		 return this.data[this.top];
+	 }
+	 public int peak() throws Exception {
+		 if(isEmpty()) {
+			 throw new Exception("sun be stack empty hai");
+		 }
+		 return this.data[this.top-1];
+	 }
+	 public int size() {
+		 return this.top;
+	 }
+	 public void Display() {
+		 for(int i=0;i<top;i++) {
+			 System.out.print(this.data[i]+" ");
+		 }
+		 System.out.println();
+	 }
+}
diff --git a/Crux_Live_Jan22/src/Lec37/stack_client.java b/Crux_Live_Jan22/src/Lec37/stack_client.java
new file mode 100644
index 0000000..59efea0
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec37/stack_client.java
@@ -0,0 +1,21 @@
+package Lec37;
+
+public class stack_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		stack s = new stack();
+		s.push(10);
+		s.push(20);
+		s.push(30);
+		s.push(40);
+		s.push(50);
+		System.out.println(s.pop());
+		s.Display();
+		System.out.println(s.peak());
+		s.push(60);
+		s.Display();
+		//s.push(70);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec38/c.java b/Crux_Live_Jan22/src/Lec38/c.java
new file mode 100644
index 0000000..045e4e6
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/c.java
@@ -0,0 +1,13 @@
+package Lec38;
+
+public class c extends p {
+	int d=2;
+	int d2 =20;
+	@Override
+	public void fun() {
+		System.out.println("fun in c");
+	}
+	public void fun2() {
+		System.out.println("fun1 in c");
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec38/client.java b/Crux_Live_Jan22/src/Lec38/client.java
new file mode 100644
index 0000000..e64091b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/client.java
@@ -0,0 +1,38 @@
+package Lec38;
+
+public class client {
+ 
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		//case 1
+		//p obj = new p();  
+		//System.out.println(obj.d);
+		//System.out.println(obj.d1);
+		//obj.fun();
+		//obj.fun1();
+		
+		//case 2
+		//p obj = new c();
+		//System.out.println(obj.d);
+		//System.out.println(obj.d1);
+		//System.out.println(((c)(obj)).d2);
+		//System.out.println(((c)(obj)).d);
+		//obj.fun();//function override hua hai jo new k side hoga usme ki value print hogi
+		//obj.fun1();
+		//((c)(obj)).fun2();
+		
+		//case3
+		//c obj  = new p();
+	  //  System.out.println(obj.d);
+		//System.out.println(obj.d1);
+		//System.out.println(obj.d2);
+		//obj.fun();
+		//case4
+		/*
+		 * c obj = new c(); System.out.println(obj.d); System.out.println(obj.d1);
+		 * System.out.println(obj.d2); System.out.println(((p)obj).d);
+		 */
+	
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec38/dynamic_client.java b/Crux_Live_Jan22/src/Lec38/dynamic_client.java
new file mode 100644
index 0000000..34ab5c0
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/dynamic_client.java
@@ -0,0 +1,24 @@
+package Lec38;
+
+public class dynamic_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		dynamic_stack ds = new dynamic_stack();
+		ds.push(10);
+		ds.push(20);
+		ds.push(30);
+		ds.push(40);
+		ds.push(50);
+		System.out.println(ds.peak());
+		ds.push(60);
+		ds.Display();
+		ds.push(100);
+		ds.push(200);
+		ds.push(300);
+		ds.push(400);
+		ds.push(500);
+		ds.Display();
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec38/dynamic_queue.java b/Crux_Live_Jan22/src/Lec38/dynamic_queue.java
new file mode 100644
index 0000000..415620d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/dynamic_queue.java
@@ -0,0 +1,18 @@
+package Lec38;
+import Lec37.queue;
+public class dynamic_queue extends queue{
+	@Override
+	public void Enqueue(int item) throws Exception {
+		if(super.isFull()) {
+			int []arr = new int[2*super.data.length];
+			for(int i=0;i<super.data.length;i++)
+			{
+				int idx = (this.front+i)%this.data.length;
+				arr[i]=data[idx];
+			}
+			this.data=arr;
+			this.front=0;
+		}
+		super.Enqueue(item);
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec38/dynamic_stack.java b/Crux_Live_Jan22/src/Lec38/dynamic_stack.java
new file mode 100644
index 0000000..2e7ca3b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/dynamic_stack.java
@@ -0,0 +1,18 @@
+package Lec38;
+import Lec37.stack;
+public class dynamic_stack extends stack{
+
+	@Override
+	public void push(int item) throws Exception {
+		if(super.isfull()) {
+			int[]arr  = new int[2*super.data.length];
+			for(int i=0;i<super.data.length;i++)
+			{
+				arr[i]=this.data[i];
+			}
+			super.data=arr;
+		}
+		super.push(item);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec38/dynamicqueue_client.java b/Crux_Live_Jan22/src/Lec38/dynamicqueue_client.java
new file mode 100644
index 0000000..5db70e9
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/dynamicqueue_client.java
@@ -0,0 +1,23 @@
+package Lec38;
+
+public class dynamicqueue_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		dynamic_queue dq = new dynamic_queue();
+		dq.Enqueue(10);
+		dq.Enqueue(20);
+		dq.Enqueue(30);
+		dq.Enqueue(40);
+		System.out.println(dq.dequeue());
+		System.out.println(dq.dequeue());
+		dq.Enqueue(50);
+		dq.Enqueue(60);
+		dq.Enqueue(70);
+		dq.Display();
+		dq.Enqueue(80);
+		dq.Enqueue(90);
+		dq.Display();
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec38/method_overloading.java b/Crux_Live_Jan22/src/Lec38/method_overloading.java
new file mode 100644
index 0000000..0cfc13e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/method_overloading.java
@@ -0,0 +1,26 @@
+package Lec38;
+
+public class method_overloading {
+   public static void main(String[] args) {
+	System.out.println(add(2,4));
+	System.out.println(add(2,4,9));
+	System.out.println(add(2,4,7.9));
+	System.out.println(add(2,4,3,5,6,8,8));
+}
+   public static int add(int a,int b) {
+	   return a+b;
+   }
+   public static int add(int a,int b,int c) {
+	   return a+b+c;
+   }
+   public static int add(int a,int b,double c) {
+	   return(int)(a+b+c);
+   }
+   public static int add(int ...a) //for variable nos. of argument
+   {
+	   int sum=0;
+	   for(int i=0;i<a.length;i++) {
+	   sum = sum+a[i];}
+	   return sum;
+   }
+}
diff --git a/Crux_Live_Jan22/src/Lec38/p.java b/Crux_Live_Jan22/src/Lec38/p.java
new file mode 100644
index 0000000..c4f0922
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec38/p.java
@@ -0,0 +1,13 @@
+package Lec38;
+
+public class p {
+	int d=1;
+	int d1 =10;
+	
+	public void fun() {
+		System.out.println("fun in p");
+	}
+	public void fun1() {
+		System.out.println("fun1 in p");
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec39/Stack_java.java b/Crux_Live_Jan22/src/Lec39/Stack_java.java
new file mode 100644
index 0000000..a8ad11b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/Stack_java.java
@@ -0,0 +1,19 @@
+package Lec39;
+
+import java.util.Stack;
+
+public class Stack_java {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Stack<Integer> st = new Stack<>();
+		st.push(10);
+		st.push(20);
+		st.push(30);
+		st.push(40);
+		st.push(50);
+		System.out.println(st.peek());
+		System.out.println(st);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec39/Stack_reverse.java b/Crux_Live_Jan22/src/Lec39/Stack_reverse.java
new file mode 100644
index 0000000..f0cdd2d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/Stack_reverse.java
@@ -0,0 +1,37 @@
+package Lec39;
+
+import java.util.Stack;
+
+public class Stack_reverse {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        Stack<Integer> st = new Stack<>();
+        st.push(10);
+		st.push(20);
+		st.push(30);
+		st.push(40);
+		st.push(50);
+		System.out.println(st);
+		Reverse(st);
+		System.out.println(st);
+	}
+public static void Reverse(Stack<Integer>st) {
+	if(st.isEmpty()) {
+		return;
+	}
+	int x = st.pop();
+	Reverse(st);
+	Insert_Down(st,x);
+}
+private static void Insert_Down(Stack<Integer>st,int x) {
+	if(st.isEmpty())
+	{
+		st.push(x);
+		return;
+	}
+	int y=st.pop();
+	Insert_Down(st,x);
+	st.push(y);
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec39/Stack_using_queue_client.java b/Crux_Live_Jan22/src/Lec39/Stack_using_queue_client.java
new file mode 100644
index 0000000..6bcfa5e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/Stack_using_queue_client.java
@@ -0,0 +1,18 @@
+package Lec39;
+
+public class Stack_using_queue_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		stack_using_queue st = new stack_using_queue();
+		st.push(10);
+		st.push(20);
+		st.push(30);
+		st.push(40);
+		st.push(50);
+		System.out.println(st.peak());
+		System.out.println(st.pop());
+		System.out.println(st.peak());
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec39/queue_reverse.java b/Crux_Live_Jan22/src/Lec39/queue_reverse.java
new file mode 100644
index 0000000..e329cd8
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/queue_reverse.java
@@ -0,0 +1,27 @@
+package Lec39;
+import Lec38.dynamic_queue;
+public class queue_reverse {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		dynamic_queue dq = new dynamic_queue();
+		dq.Enqueue(10);
+		dq.Enqueue(20);
+		dq.Enqueue(30);
+		dq.Enqueue(40);
+		dq.Enqueue(50);
+		dq.Display();
+		reverse(dq);
+		dq.Display();
+	}
+	public static void reverse(dynamic_queue dq) throws Exception{
+		if(dq.isEmpty())
+		{
+			return;
+		}
+		int x = dq.dequeue();
+		reverse(dq);
+		dq.Enqueue(x);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec39/queue_using_stack.java b/Crux_Live_Jan22/src/Lec39/queue_using_stack.java
new file mode 100644
index 0000000..783e913
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/queue_using_stack.java
@@ -0,0 +1,41 @@
+package Lec39;
+import Lec38.dynamic_stack;
+public class queue_using_stack {
+	private dynamic_stack data;
+	
+	public queue_using_stack() {
+		this.data=new dynamic_stack();
+	}
+	public boolean isEmpty() {
+		return this.data.isEmpty();
+	}
+	public int size() {
+		return this.data.size();
+	}
+	public void enqueue(int x) throws Exception
+	{
+		this.data.push(x);
+	}
+	public int dequeue() throws Exception {
+		dynamic_stack temp = new dynamic_stack();
+		while(this.data.size()!=1) {
+			temp.push(this.data.pop());
+		}
+		int x = this.data.pop();
+		while(temp.size()!=0) {
+			this.data.push(temp.pop());
+		}
+		return x;
+	}
+	public int getFront() throws Exception {
+		dynamic_stack temp = new dynamic_stack();
+		while(this.data.size()!=1) {
+			temp.push(this.data.pop());
+		}
+		int x = this.data.peak();
+		while(temp.size()!=0) {
+			this.data.push(temp.pop());
+		}
+		return x;
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec39/queue_using_stack_client.java b/Crux_Live_Jan22/src/Lec39/queue_using_stack_client.java
new file mode 100644
index 0000000..5303003
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/queue_using_stack_client.java
@@ -0,0 +1,17 @@
+package Lec39;
+
+public class queue_using_stack_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		queue_using_stack qs = new queue_using_stack();
+		qs.enqueue(10);
+		qs.enqueue(20);
+		qs.enqueue(30);
+		qs.enqueue(40);
+		qs.enqueue(50);
+		System.out.println(qs.dequeue());
+		System.out.println(qs.getFront());
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec39/stack_using_queue.java b/Crux_Live_Jan22/src/Lec39/stack_using_queue.java
new file mode 100644
index 0000000..5f03ab4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec39/stack_using_queue.java
@@ -0,0 +1,38 @@
+package Lec39;
+
+import Lec38.dynamic_queue;
+public class stack_using_queue {
+
+	private dynamic_queue data;
+	public stack_using_queue() {
+		this.data= new dynamic_queue();
+	}
+   public boolean isEmpty() {
+	   return this.data.isEmpty();
+   }
+   public int size() {
+	   return this.data.size();
+   }
+   public boolean isFull() {
+	   return this.data.isFull();
+   }
+   //complexity o(n)
+   public void push(int item) throws Exception {
+	   dynamic_queue temp = new dynamic_queue();
+	   while(!this.data.isEmpty()) {
+		   temp.Enqueue(data.dequeue());
+	   }
+	   this.data.Enqueue(item);
+	   while(!temp.isEmpty()) {
+		   data.Enqueue(temp.dequeue());
+	   }
+   }
+   public int pop() throws Exception
+   {
+	   return this.data.dequeue();
+   }
+   public int peak() throws Exception
+   {
+	   return this.data.getfront();
+   }
+}
diff --git a/Crux_Live_Jan22/src/Lec4/Counts_digit.java b/Crux_Live_Jan22/src/Lec4/Counts_digit.java
new file mode 100644
index 0000000..ecec16a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/Counts_digit.java
@@ -0,0 +1,26 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class Counts_digit {
+ 
+	public static void main(String[] args) {
+		Scanner sc = new Scanner(System.in);
+		int number = sc.nextInt();
+		int digit = sc.nextInt();
+		int count = 0;
+		while(number>0)
+		{
+			int dig = number%10;
+			if(dig == digit)
+			{
+				count++;
+			}
+			number/=10;
+		}
+		System.out.println(count);
+	}
+
+}
+
+    	
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec4/GCD.java b/Crux_Live_Jan22/src/Lec4/GCD.java
new file mode 100644
index 0000000..384bd49
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/GCD.java
@@ -0,0 +1,24 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class GCD {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int divisor = sc.nextInt();
+		int dividend = sc.nextInt();
+		if(divisor<dividend) {
+	    
+		while(dividend%divisor!=0)
+		{ 
+			int rem = dividend%divisor;
+			
+			dividend  = divisor;
+			divisor = rem;
+		}
+       System.out.println(divisor);
+	}
+
+}}
diff --git a/Crux_Live_Jan22/src/Lec4/Lcm_of_number.java b/Crux_Live_Jan22/src/Lec4/Lcm_of_number.java
new file mode 100644
index 0000000..f2183af
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/Lcm_of_number.java
@@ -0,0 +1,27 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class Lcm_of_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int N1 = sc.nextInt();
+		int N2 = sc.nextInt();
+		int product = (N1*N2);
+		if(N1<N2) {
+	    
+		while(N2%N1!=0)
+		{ 
+			int rem = N2%N1;
+			
+			N2  = N1;
+			N1 = rem;
+		}
+       System.out.println(product/N1);
+	}
+
+}}
+
diff --git a/Crux_Live_Jan22/src/Lec4/N_Fabonacci.java b/Crux_Live_Jan22/src/Lec4/N_Fabonacci.java
new file mode 100644
index 0000000..7f5abb4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/N_Fabonacci.java
@@ -0,0 +1,22 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class N_Fabonacci {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int a = 0;
+		int b = 1;
+		for(int i=1;i<=n;i++)
+		{
+			int c = a+b;
+			a=b;
+			b=c;
+		}
+         System.out.println(a);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec4/Prime_no.java b/Crux_Live_Jan22/src/Lec4/Prime_no.java
new file mode 100644
index 0000000..2daee39
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/Prime_no.java
@@ -0,0 +1,32 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class Prime_no {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+			int fact = 0;
+		for(int j=2;j<n;j++)
+		{
+			if(n%j==0)
+			{
+				fact++;
+		}}
+			if(fact>=1)
+			{
+				System.out.println("Not Prime");
+			}
+			else
+			{
+				System.out.println("Prime");
+			}
+
+
+
+
+	  }}
+
+
diff --git a/Crux_Live_Jan22/src/Lec4/Print_Series.java b/Crux_Live_Jan22/src/Lec4/Print_Series.java
new file mode 100644
index 0000000..7780a84
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/Print_Series.java
@@ -0,0 +1,25 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class Print_Series {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n1 = sc.nextInt();
+		int n2 = sc.nextInt();
+		int n = 1;
+		for(int i=1;i<=n1;)
+		{
+			if((3*n+2)%n2!=0)
+			{
+				System.out.println(3*n+2);
+			     i++;
+			}
+		n++;
+		}
+      
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec4/Simple_input.java b/Crux_Live_Jan22/src/Lec4/Simple_input.java
new file mode 100644
index 0000000..31a5a08
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/Simple_input.java
@@ -0,0 +1,26 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class Simple_input {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int sum = 0;
+		int n;
+		while(true) {
+			 n = sc.nextInt();
+			sum = sum+1;
+			
+			if(sum<0) {
+				 System.out.println(n);
+			}
+			else{
+				break;
+		}
+				
+     
+	}
+
+	}}
diff --git a/Crux_Live_Jan22/src/Lec4/no_of_primes.java b/Crux_Live_Jan22/src/Lec4/no_of_primes.java
new file mode 100644
index 0000000..34fbf57
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/no_of_primes.java
@@ -0,0 +1,29 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class no_of_primes {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+			int fact = 0;
+		for(int num=2;num<=n;num++)
+		{
+			boolean isPrime = true;
+			for(int i = 2;i<=num/2;i++)
+			{
+				if(num%i==0)
+				{
+					isPrime = false;
+					break;
+				}
+			}
+ 
+             if(isPrime==true) {
+System.out.println(num);
+	  }}}}
+
+
diff --git a/Crux_Live_Jan22/src/Lec4/reverse_no.java b/Crux_Live_Jan22/src/Lec4/reverse_no.java
new file mode 100644
index 0000000..26df204
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec4/reverse_no.java
@@ -0,0 +1,20 @@
+package Lec4;
+
+import java.util.Scanner;
+
+public class reverse_no {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int ans = 0;
+		while(n!=0) {
+			int digit = n%10;
+			ans = ans*10+digit;
+			n/=10;
+		}
+        System.out.println(ans);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec40/Histrogram_leetcode.java b/Crux_Live_Jan22/src/Lec40/Histrogram_leetcode.java
new file mode 100644
index 0000000..8fff984
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec40/Histrogram_leetcode.java
@@ -0,0 +1,44 @@
+package Lec40;
+
+import java.util.Stack;
+
+public class Histrogram_leetcode {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        int[]arr = {2,3,5,4,6,1,7};
+        System.out.println(area(arr));
+	}
+public static int area(int[]arr) {
+	Stack<Integer>st = new Stack<>();
+	int ans=0;
+	for(int i=0;i<arr.length;i++) {
+	    
+		while(!st.isEmpty()&&arr[i]<arr[st.peek()]) {
+			int r=i;
+			int h = arr[st.pop()];
+			if(st.isEmpty()) {
+				ans = Math.max(ans, h*r);
+			}
+			else {
+				int l = st.peek();
+				ans = Math.max(ans, h*(r-l-1));
+			}
+		
+	}
+		st.push(i);
+	}
+	int r = arr.length;
+	while(!st.isEmpty()) {
+		int h = arr[st.pop()];
+		if(st.isEmpty()) {
+			ans = Math.max(ans, h*r);
+		}
+		else {
+			int l = st.peek();
+			ans = Math.max(ans, h*(r-l-1));
+		}
+	}
+	return ans;
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec40/next_greater_element.java b/Crux_Live_Jan22/src/Lec40/next_greater_element.java
new file mode 100644
index 0000000..6b8429b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec40/next_greater_element.java
@@ -0,0 +1,30 @@
+package Lec40;
+
+import java.util.Stack;
+
+public class next_greater_element {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[]arr = {11,2,3,23,9,13,14,15};
+		nge(arr);
+	}
+public static void nge(int[]arr) {
+	int[]nge = new int [arr.length];
+    Stack<Integer> st = new Stack<>();
+    for(int i=0;i<arr.length;i++) {
+    	while(!st.isEmpty()&& arr[i]>arr[st.peek()]) {
+    		int ii=st.pop();
+    		nge[ii]=arr[i];
+    	}
+    	st.push(i);
+    }
+    while(!st.isEmpty()) {
+    	int ii=st.pop();
+    	nge[ii]=-1;
+    }
+    for(int i=0;i<nge.length;i++) {
+    	System.out.println(arr[i]+" "+" "+nge[i]);
+    }
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec40/stock_span.java b/Crux_Live_Jan22/src/Lec40/stock_span.java
new file mode 100644
index 0000000..836dd69
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec40/stock_span.java
@@ -0,0 +1,33 @@
+package Lec40;
+
+import java.util.Stack;
+
+public class stock_span {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[]arr = {91,11,13,15,38,42,37};
+		span_cal(arr);
+	}
+  public static void span_cal(int[]arr) {
+	  int[]span = new int[arr.length];
+	  Stack<Integer> st = new Stack<>();
+	  for(int i=0;i<arr.length;i++) {
+		  while(!st.isEmpty()&& arr[i]>arr[st.peek()])
+		  {
+			  st.pop();
+		  }
+		  if(st.isEmpty()) {
+			  span[i]=i+1;
+		  }
+		  else {
+			  span[i]=i-st.peek();
+		  }
+		  st.push(i);
+	  }
+	  for(int i=0;i<span.length;i++)
+	  {
+		  System.out.println(arr[i]+" "+" "+span[i]);
+	  }
+  }
+}
diff --git a/Crux_Live_Jan22/src/Lec40A/min_stack.java b/Crux_Live_Jan22/src/Lec40A/min_stack.java
new file mode 100644
index 0000000..2b849c9
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec40A/min_stack.java
@@ -0,0 +1,10 @@
+package Lec40A;
+
+public class min_stack {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec41/Linked_list.java b/Crux_Live_Jan22/src/Lec41/Linked_list.java
new file mode 100644
index 0000000..62d1325
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec41/Linked_list.java
@@ -0,0 +1,131 @@
+package Lec41;
+
+public class Linked_list {
+
+	public class Node {
+		// TODO Auto-generated method stub
+		int data;
+		Node next;
+		public Node(int data) {
+			this.data=data;
+		}
+	}
+	private Node head;
+	private int size;
+	private Node tail;
+	public void addfirst(int item) {
+		Node nn = new Node(item);
+		if(this.size==0) {
+			this.head=nn;
+			this.tail=nn;
+			this.size++;
+		}
+		else {
+			nn.next=this.head;
+			this.head=nn;
+			this.size++;
+		}
+	}
+	public void addlast(int item) {
+		if(this.size==0) {
+			addfirst(item);
+		}
+		else {
+			Node nn  = new Node(item);
+			this.tail.next=nn;
+			this.tail =nn;
+			this.size++;
+		}
+	}
+	public void addatindex(int item,int k) throws Exception {
+		if(k<0 || k>size)
+		{
+			throw new Exception("index ki value range se baaahar hai");
+		}
+		if(k==0) {
+			addfirst(item);
+		}
+		else if(k==size) {
+			addlast(item);;
+		}
+		else {
+			Node nn = new Node(item);
+			Node k_1th = getnode(k-1);
+			nn.next=k_1th.next;
+			k_1th.next=nn;
+			this.size++;
+		}
+	}
+	public int getfirst() throws Exception {
+		if(head==null) {
+			throw new Exception("linkedlist khaali hai");
+		}
+		return this.head.data;
+	}
+	public int getlast() throws Exception {
+		if(this.head==null) {
+			throw new Exception("linkedlist khaali hai");
+		}
+		return this.tail.data;
+	}
+	public int getatindex(int k) throws Exception {
+		return this.getnode(k).data;
+	}
+	private Node getnode(int k) throws Exception {
+		if(k<0 || k>=size) {
+			throw new Exception("index out of bound");
+		}
+		Node temp = head;
+		for(int i=1;i<=k;i++) {
+			temp = temp.next;
+		}
+		return temp;
+	}
+	public int removefirst() {
+		Node temp = this.head;
+		this.head = this.head.next;
+		temp.next=null;
+		this.size--;
+		return temp.data;
+	}
+	public int removelast() throws Exception {
+		if(this.head==null) {
+			throw new Exception("linkedlist khaali hai");
+		}
+		if(this.size==1) {
+			return removefirst();
+		}
+		Node temp = getnode(size-2);
+		int rv = tail.data;
+		this.tail=temp;
+		this.tail.next=null;
+		this.size--;
+		return rv;
+	}
+
+public int removeatindex(int k) throws Exception {
+	if(k<0|| k>=size) {
+		throw new Exception("linkedlist khaali hai");}
+	if(k==0) {
+		return removefirst();}
+	else if(k==this.size-1) {
+		return removelast();
+	}
+	else {
+		Node kth = getnode(k);
+		Node k_1th = getnode(k-1);
+		k_1th.next = kth.next;
+		kth.next=null;
+		this.size--;
+		return kth.data;
+		
+	}
+	}
+	public void display() {
+		Node temp = this.head;
+		while(temp!=null) {
+			System.out.print(temp.data+"--->");
+			temp = temp.next;
+		}
+		System.out.println(".");
+}}
diff --git a/Crux_Live_Jan22/src/Lec41/Linked_list_client.java b/Crux_Live_Jan22/src/Lec41/Linked_list_client.java
new file mode 100644
index 0000000..269125a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec41/Linked_list_client.java
@@ -0,0 +1,21 @@
+package Lec41;
+
+public class Linked_list_client {
+
+	public static void main(String[] args) throws Exception {
+		// TODO Auto-generated method stub
+		Linked_list ll = new Linked_list();
+		
+		 ll.addfirst(10); ll.addfirst(20); ll.addfirst(30);
+		 ll.addfirst(40);
+		 ll.addfirst(50);
+		 ll.addlast(60); 
+		 ll.addatindex(-90, 3);
+		 ll.display();
+		 
+		//System.out.println(ll.getfirst());
+		//System.out.println(ll.getlast());
+		//System.out.println(ll.getatindex(3));
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec42/cycle_linked_list.java b/Crux_Live_Jan22/src/Lec42/cycle_linked_list.java
new file mode 100644
index 0000000..7c97ec5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec42/cycle_linked_list.java
@@ -0,0 +1,82 @@
+package Lec42;
+
+import Lec41.Linked_list.Node;
+import Lec42.middle_of_linked_list.ListNode;
+
+public class cycle_linked_list {
+	public class Node {
+		// TODO Auto-generated method stub
+		int data;
+		Node next;
+		public Node(int data) {
+			this.data=data;
+		}
+	}
+	private Node head;
+	private int size;
+	private Node tail;
+	public void addfirst(int item) {
+		Node nn = new Node(item);
+		if(this.size==0) {
+			this.head=nn;
+			this.tail=nn;
+			this.size++;
+		}
+		else {
+			nn.next=this.head;
+			this.head=nn;
+			this.size++;
+		}
+	}
+	public void addlast(int item) {
+		if(this.size==0) {
+			addfirst(item);
+		}
+		else {
+			Node nn  = new Node(item);
+			this.tail.next=nn;
+			this.tail =nn;
+			this.size++;
+		}
+	}
+	public void createcycle() {
+		//this.tail.next=this.head;  circular
+		this.tail.next=this.head.next;  //cyclic
+	}
+	 public boolean hasCycle() {
+		 Node fast = this.head;
+		 Node slow = this.head;
+		 while(fast!=null && fast.next!=null) {
+			 fast=fast.next.next;
+			 slow=slow.next;
+			 if(slow==fast)
+			 {
+				 return true;
+		 }
+	    }
+		 return false;
+}
+	public void display() {
+		Node temp = this.head;
+		while(temp!=null) {
+			System.out.print(temp.data+"--->");
+			temp = temp.next;
+		}
+		System.out.println(".");
+}
+	public static void main(String[] args) {
+		cycle_linked_list cl =  new cycle_linked_list();
+		cl.addlast(1);
+		cl.addlast(2);
+		cl.addlast(3);
+		cl.addlast(4);
+		cl.addlast(5);
+		cl.addlast(6);
+		cl.addlast(7);
+		cl.addlast(8);
+		//cl.display();
+		cl.createcycle();
+		//cl.display();
+		System.out.println(cl.hasCycle());
+	}
+}
diff --git a/Crux_Live_Jan22/src/Lec42/middle_of_linked_list.java b/Crux_Live_Jan22/src/Lec42/middle_of_linked_list.java
new file mode 100644
index 0000000..561c82b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec42/middle_of_linked_list.java
@@ -0,0 +1,26 @@
+package Lec42;
+
+public class middle_of_linked_list {
+	public class ListNode {
+		     int val;
+		     ListNode next;
+		      ListNode() {
+		    	  
+		      }
+		     ListNode(int val) { 
+		    	 this.val = val; }
+		     ListNode(int val, ListNode next) {
+		    	 this.val = val; this.next = next; }
+		}
+         class Solution{
+        	 public ListNode middleNode(ListNode head) {
+        		 ListNode fast = head;
+        		 ListNode slow = head;
+        		 while(fast!=null && fast.next!=null) {
+        			 fast=fast.next.next;
+        			 slow=slow.next;
+        		 }
+        		 return slow;
+        	 }
+         }
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Binary_to_decimal.java b/Crux_Live_Jan22/src/Lec5/Binary_to_decimal.java
new file mode 100644
index 0000000..c86da9e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Binary_to_decimal.java
@@ -0,0 +1,24 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Binary_to_decimal {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		long num = sc.nextLong();
+		long i=1;
+		long sum=0;
+		while(num!=0) {
+			long rem=num%10;
+			sum+=i*rem;
+			i*=2;
+			num=num/10;
+		}
+		System.out.println(sum);
+				
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Chewbacca_and_Number.java b/Crux_Live_Jan22/src/Lec5/Chewbacca_and_Number.java
new file mode 100644
index 0000000..9970f8d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Chewbacca_and_Number.java
@@ -0,0 +1,38 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Chewbacca_and_Number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        Scanner sc = new Scanner(System.in);
+        long n  = sc.nextLong();
+        long ans = 0;
+        long mul = 1;
+        while(n>0)
+        {
+        	int rem = (int)(n%10);
+        	if(rem>=5) {
+        		int t = 9-rem;
+        		ans = ans+t*mul;
+        	}
+        	else
+        	{
+        		ans=ans+rem*mul;
+        	}
+        	mul = mul*10;
+        	n/=10;
+        }
+        if(n==9 || n<5) {
+        	ans = ans+n*mul;
+        }
+        else {
+        
+        	int t = (int)(9-n);
+        	ans = ans+t*mul;
+        }
+        		System.out.println(ans);
+	}
+	
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Inverse_of_numbers.java b/Crux_Live_Jan22/src/Lec5/Inverse_of_numbers.java
new file mode 100644
index 0000000..7c0218b
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Inverse_of_numbers.java
@@ -0,0 +1,22 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Inverse_of_numbers {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+      Scanner sc = new Scanner(System.in);
+      int n = sc.nextInt();
+      int pos = 1;
+      int ans = 0;
+      while(n>0) {
+    	  int rem = n%10;
+    	  ans = (int)(ans+pos*(Math.pow(10, rem-1)));
+    	  n/=10;
+    	  pos++;
+      }
+      System.out.println(ans);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Lower_Upper.java b/Crux_Live_Jan22/src/Lec5/Lower_Upper.java
new file mode 100644
index 0000000..f183ca6
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Lower_Upper.java
@@ -0,0 +1,26 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Lower_Upper {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		char n = sc.next().charAt(0);
+		if(n>='a'&&n<='z')
+		{
+			System.out.println("lowercase");
+		}
+		else if(n>='A'&&n<='Z')
+		{
+			System.out.println("UPPERCASE");
+		}
+		else
+		{
+			System.out.println("Invalid");
+		}
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Replace_interger.java b/Crux_Live_Jan22/src/Lec5/Replace_interger.java
new file mode 100644
index 0000000..d618012
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Replace_interger.java
@@ -0,0 +1,30 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Replace_interger {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+	    long n= sc.nextLong();
+	    if(n==0){
+	        System.out.println(5);
+
+	    }else{
+	    long sum=0;
+	    long multi = 1;
+	    while(n>0){
+	        long rem=n%10;
+	        if (rem==0){
+	            rem=5;
+	        }
+	        sum+=rem*multi;
+	        multi*=10;
+	        n/=10;
+	    }
+	    System.out.println(sum);
+	    }
+	    }
+	}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec5/Shopping_game.java b/Crux_Live_Jan22/src/Lec5/Shopping_game.java
new file mode 100644
index 0000000..d5df0aa
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Shopping_game.java
@@ -0,0 +1,37 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Shopping_game {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+        Scanner sc = new Scanner(System.in);
+        int t = sc.nextInt();
+        while(t-->0) {
+        int M = sc.nextInt();
+        int N = sc.nextInt();
+        int total_ayush = 0;
+        int total_harshit = 0;
+        int count = 1;
+        while(true)
+        {
+        	total_ayush+=count;
+        	if(total_ayush>M)
+        	{
+        		System.out.println("Harshit");
+        		break;
+        	}
+        		count++;
+        		total_harshit+=count;
+        		if(total_harshit>N)
+        		{
+        			System.out.println("Aayush");
+        			break;
+        		}
+        		count++;
+        	}
+        	
+        
+
+}}}
diff --git a/Crux_Live_Jan22/src/Lec5/Sum_of_even_and_odd_place.java b/Crux_Live_Jan22/src/Lec5/Sum_of_even_and_odd_place.java
new file mode 100644
index 0000000..5a1682d
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Sum_of_even_and_odd_place.java
@@ -0,0 +1,34 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class Sum_of_even_and_odd_place {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int oddsum = 0;
+		int evensum = 0;
+		int num = n;
+		int c= 1;
+		while(num!=0)
+		{
+			int rem = num%10;
+			if(c%2==0)
+			{
+				evensum+=rem;
+			}
+			else
+			{
+				oddsum+=rem;
+			}
+			num=num/10;
+			c++;
+		}
+				
+            System.out.println(oddsum);
+            System.out.println(evensum);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec5/Von_Neuman_Loves_Binary.java b/Crux_Live_Jan22/src/Lec5/Von_Neuman_Loves_Binary.java
new file mode 100644
index 0000000..e1f9e4f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/Von_Neuman_Loves_Binary.java
@@ -0,0 +1,10 @@
+package Lec5;
+
+public class Von_Neuman_Loves_Binary {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec5/decimal_to_octal_conversion.java b/Crux_Live_Jan22/src/Lec5/decimal_to_octal_conversion.java
new file mode 100644
index 0000000..e8e69ae
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec5/decimal_to_octal_conversion.java
@@ -0,0 +1,52 @@
+package Lec5;
+
+import java.util.Scanner;
+
+public class decimal_to_octal_conversion {
+
+	static void octaltodecimal(int deciNum)
+
+    {
+
+        int octalNum = 0, countval = 1;
+
+        int dNo = deciNum;
+
+        while (deciNum != 0) {
+ 
+
+          
+
+            int remainder = deciNum % 8;
+ 
+
+        
+
+            octalNum += remainder * countval;
+ 
+
+         
+
+            countval = countval * 10;
+
+            deciNum /= 8;
+
+        }
+
+        System.out.println(octalNum);
+
+    }
+ 
+
+    public static void main(String[] args)
+
+    {
+      Scanner sc = new Scanner(System.in);
+        int n = sc.nextInt();
+ 
+
+        octaltodecimal(n);
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec7/Armstrong_numbers_btw_n1_n2.java b/Crux_Live_Jan22/src/Lec7/Armstrong_numbers_btw_n1_n2.java
new file mode 100644
index 0000000..7393d69
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Armstrong_numbers_btw_n1_n2.java
@@ -0,0 +1,50 @@
+package Lec7;
+
+import java.util.Scanner;
+
+public class Armstrong_numbers_btw_n1_n2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int n1 = sc.nextInt();
+		int n2 = sc.nextInt();
+		for(int i = n1;i<=n2;i++) {
+			if(isarmstrong(i)==true) {
+		System.out.println(i);}}
+
+	}
+	public static boolean isarmstrong(int n)
+	{
+		int d = countofdigit(n);
+		int ans = 0;
+		int temp  = n;
+		while(n>0)
+		{
+			int rem = n%10;
+			ans = (int)(ans+Math.pow(rem, d));
+			n/=10;
+		}
+		if(ans==temp)
+		{
+			return true;
+		}
+		else
+		{
+			return false;
+		}
+	}
+	
+	public static int countofdigit(int n)
+	{    int c = 0;
+		while(n>0)
+		{
+			n/=10;
+			c++;
+		}
+		return c;
+	}
+
+}
+
diff --git a/Crux_Live_Jan22/src/Lec7/Boston_number.java b/Crux_Live_Jan22/src/Lec7/Boston_number.java
new file mode 100644
index 0000000..d82b33a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Boston_number.java
@@ -0,0 +1,56 @@
+package Lec7;
+import java.util.*;
+public class Boston_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		   int a = sc.nextInt();
+		   if(sumofdigit(a)==BostonNo(a)){
+		       System.out.println("1");
+		   }
+		   else{System.out.println("0");}
+		   
+		    }
+		    public static int sumofdigit(int n)
+		    {
+		        int sum=0;
+		        while(n>0)
+		        {
+		            int rem = n%10;
+		            sum=sum+rem;
+		            n/=10;
+		        }
+		        return sum;
+		    }
+		    public static int BostonNo(int n)
+		    {
+		        int sum = 0;
+		        int fact = 0;
+		        for(int i=2;i<=n;++i)
+		        {
+		            while(n%i==0)
+		            {
+		                sum+=sumofdigit(i);
+		                n/=i;
+		            }
+		        }
+		        return sum;
+		    }
+		//    public static int prime_no(int n)
+		 //   {
+		 //       int fact = 0;
+		 //       for(int i=2;i<n;i++)
+		  //      {
+		   //         if(n%i==0)
+		   //         {
+		    //            fact++;
+		   //         }
+		     //   }
+		     //   if(fact==0)
+		     //   {
+		     //       return 1;
+		    //    }
+		   //     return 0;
+		  // }
+		}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec7/Function_demo.java b/Crux_Live_Jan22/src/Lec7/Function_demo.java
new file mode 100644
index 0000000..ff22360
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Function_demo.java
@@ -0,0 +1,28 @@
+package Lec7;
+
+public class Function_demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		System.out.println("hey");
+		addtwonumber();
+		System.out.println("bye");
+
+	}
+	public static void addtwonumber()
+	{
+		int a=9;
+		int b=11;
+		int c = a+b;
+		subtwonumber();
+		System.out.println(c);
+	}
+	public static void subtwonumber()
+	{
+		int a=10;
+		int b=7;
+		int c=a-b;
+		System.out.println(c);
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec7/Function_demo2.java b/Crux_Live_Jan22/src/Lec7/Function_demo2.java
new file mode 100644
index 0000000..9f551c5
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Function_demo2.java
@@ -0,0 +1,21 @@
+package Lec7;
+
+public class Function_demo2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		System.out.println("hey");
+		System.out.println("bye");
+		int c = addtwonumber();
+		System.out.println(c);
+
+	}
+	public static int addtwonumber()
+	{
+		int a=10;
+		int b=10;
+		int c=a+b;
+		return c;
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec7/Function_demo3.java b/Crux_Live_Jan22/src/Lec7/Function_demo3.java
new file mode 100644
index 0000000..674e482
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Function_demo3.java
@@ -0,0 +1,17 @@
+package Lec7;
+
+public class Function_demo3 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int a=5;
+		int b=5;
+		add(a,b);
+				
+	}
+     public static void add(int a,int b)
+     {
+    	int c=a+b;
+    	System.out.println(c);
+     }
+}
diff --git a/Crux_Live_Jan22/src/Lec7/Is_Armstrong_number.java b/Crux_Live_Jan22/src/Lec7/Is_Armstrong_number.java
new file mode 100644
index 0000000..c0f19a8
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/Is_Armstrong_number.java
@@ -0,0 +1,45 @@
+package Lec7;
+
+import java.util.Scanner;
+
+public class Is_Armstrong_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		System.out.println(isarmstrong(n));
+
+	}
+	public static boolean isarmstrong(int n)
+	{
+		int d = countofdigit(n);
+		int ans = 0;
+		int temp  = n;
+		while(n>0)
+		{
+			int rem = n%10;
+			ans = (int)(ans+Math.pow(rem, d));
+			n/=10;
+		}
+		if(ans==temp)
+		{
+			return true;
+		}
+		else
+		{
+			return false;
+		}
+	}
+	
+	public static int countofdigit(int n)
+	{    int c = 0;
+		while(n>0)
+		{
+			n/=10;
+			c++;
+		}
+		return c;
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec7/function_demo4.java b/Crux_Live_Jan22/src/Lec7/function_demo4.java
new file mode 100644
index 0000000..82bfd27
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec7/function_demo4.java
@@ -0,0 +1,19 @@
+package Lec7;
+
+public class function_demo4 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		System.out.println("hey");
+      int a=10;
+      int b = 5;
+      System.out.println(add(a,b));
+      System.out.println("bye");
+      
+	}
+   public static int add(int a,int b)
+   {
+	  int c = a+b;
+	  return c;
+   }
+}
diff --git a/Crux_Live_Jan22/src/Lec9/Array_Demo.java b/Crux_Live_Jan22/src/Lec9/Array_Demo.java
new file mode 100644
index 0000000..3fc1c9e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Array_Demo.java
@@ -0,0 +1,35 @@
+package Lec9;
+
+public class Array_Demo {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		int[] arr = new int[5];
+		System.out.println(arr);
+		System.out.println(arr[0]);
+		System.out.println(arr[1]);
+		System.out.println(arr[2]);
+		System.out.println(arr[3]);
+		System.out.println(arr[4]);
+		//System.out.println(arr[5]);
+		arr[0]=10;
+		arr[1]=20;
+		arr[2]=30;
+		arr[3]=40;
+		arr[4]=50;
+		System.out.println(arr[0]);
+		System.out.println(arr[1]);
+		System.out.println(arr[2]);
+		System.out.println(arr[3]);
+		System.out.println(arr[4]);
+	//	System.out.println(arr.length);
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=100*(i+1);
+			System.out.println(arr[i]);
+		}
+
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Lec9/Array_demo3.java b/Crux_Live_Jan22/src/Lec9/Array_demo3.java
new file mode 100644
index 0000000..a05754e
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Array_demo3.java
@@ -0,0 +1,21 @@
+package Lec9;
+
+public class Array_demo3 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+	
+		int[] arr = {10,20,30,50};
+        int[] other = {100,200,300,400};
+        System.out.println(arr[0]+" "+other[0]);
+        swap(arr,other);
+        System.out.println(arr[0]+" "+other[0]);
+        }
+	
+	public static void swap(int[] arr,int[]other)
+	{
+		int[] temp = arr;
+		arr = other;
+		other = temp;
+	}
+        }
diff --git a/Crux_Live_Jan22/src/Lec9/Array_swap2.java b/Crux_Live_Jan22/src/Lec9/Array_swap2.java
new file mode 100644
index 0000000..42446b0
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Array_swap2.java
@@ -0,0 +1,19 @@
+package Lec9;
+
+public class Array_swap2 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+       int a = 10;
+       int[] arr = {10,20,30,40};
+       System.out.println(arr[0]+" "+arr[1]);
+       swap(arr,0,1);
+       System.out.println(arr[0]+" "+arr[1]);
+}
+	public static void swap(int[] arr,int i,int j)
+	{
+		int temp = arr[i];
+		arr[i]=arr[j];
+		arr[j]= temp;
+	}
+	}
diff --git a/Crux_Live_Jan22/src/Lec9/Inverse_Array.java b/Crux_Live_Jan22/src/Lec9/Inverse_Array.java
new file mode 100644
index 0000000..13c4ad2
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Inverse_Array.java
@@ -0,0 +1,30 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class Inverse_Array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		int[] brr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+		   arr[i]=sc.nextInt();
+		}
+inverse(arr,brr);
+for(int i=0;i<arr.length;i++)
+{
+	System.out.println(brr[i]+" ");
+}
+	}
+public static void inverse(int[]arr,int[]brr)
+{
+	for(int i=0;i<arr.length;i++)
+	{
+		brr[arr[i]] = i;
+	}
+}
+}
diff --git a/Crux_Live_Jan22/src/Lec9/Linear_search.java b/Crux_Live_Jan22/src/Lec9/Linear_search.java
new file mode 100644
index 0000000..dc5ae0a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Linear_search.java
@@ -0,0 +1,30 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class Linear_search {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     Scanner sc = new Scanner(System.in);
+     int n = sc.nextInt();
+     int[] arr = new int[n];
+     for(int i=0;i<arr.length;i++)
+     {
+    	 arr[i]=sc.nextInt();
+     }
+     int item = sc.nextInt();
+     System.out.println(search(arr,item));
+}
+public static int search(int[]arr,int item)	
+{
+	for(int i=1;i<arr.length;i++)
+	{
+		if(arr[i]==item)
+		{
+			return i;
+		}
+	}
+	return -1;
+}
+}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec9/Max_number.java b/Crux_Live_Jan22/src/Lec9/Max_number.java
new file mode 100644
index 0000000..761f1cb
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Max_number.java
@@ -0,0 +1,30 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class Max_number {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     Scanner sc = new Scanner(System.in);
+     int n = sc.nextInt();
+     int[] arr = new int[n];
+     for(int i=0;i<arr.length;i++)
+     {
+    	 arr[i]=sc.nextInt();
+     }
+     System.out.println(max(arr));
+}
+	public static int max(int[]arr) 
+	{
+		int maxi=arr[0];
+		for(int i=1;i<arr.length;i++)
+		{
+			if(maxi<arr[i]) {
+				maxi=arr[i];
+			}
+		
+		}
+		return maxi;
+		}
+	}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec9/Min.java b/Crux_Live_Jan22/src/Lec9/Min.java
new file mode 100644
index 0000000..f992a05
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Min.java
@@ -0,0 +1,30 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class Min {
+
+	public static void main(String[] args) {
+	// TODO Auto-generated method stub
+	Scanner sc = new Scanner(System.in);
+	int n = sc.nextInt();
+	int[]arr  = new int[n];
+	for(int i=0;i<arr.length;i++)
+	{
+		arr[i]=sc.nextInt();
+	}
+	System.out.println(min(arr));
+	}
+	public static int min(int[]arr)
+	{
+		int mini = arr[0];
+		for(int i=1;i<arr.length;i++)
+		{
+			if(mini>arr[i])
+			{
+				mini = arr[i];
+			}
+		}
+		return mini;
+	}
+}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec9/Reverse_an_array.java b/Crux_Live_Jan22/src/Lec9/Reverse_an_array.java
new file mode 100644
index 0000000..d187e0f
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Reverse_an_array.java
@@ -0,0 +1,37 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class Reverse_an_array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+     Scanner sc= new Scanner(System.in);
+     int n = sc.nextInt();
+     int[] arr = new int[n];
+     for(int i=0;i<arr.length;i++)
+     {
+    	 arr[i]=sc.nextInt();
+     }
+     reverse(arr);
+     for(int i=0;i<arr.length;i++)
+     {
+    	 System.out.println(arr[i]+"");
+     }
+
+}
+public static void reverse(int[]arr)
+{   
+	int i=0;
+	int j = arr.length-1;
+	while(i<j)
+	{
+		int temp=arr[i];
+		arr[i]=arr[j];
+		arr[j]=temp;
+		i++;
+		j--;
+	}
+	
+}
+}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Lec9/Swap_demo1.java b/Crux_Live_Jan22/src/Lec9/Swap_demo1.java
new file mode 100644
index 0000000..fd36829
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/Swap_demo1.java
@@ -0,0 +1,21 @@
+package Lec9;
+
+public class Swap_demo1 {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+	   int a=10;
+	   int[]arr = {10,20,30,40};
+	   System.out.println(arr[0]+" "+arr[1]);
+	   swap(arr,0,1);
+	   System.out.println(arr[0]+" "+arr[1]);
+	
+	}
+	public static void swap(int[]arr,int i,int j)
+	{
+		int temp = i;
+		i=j;
+		j=temp;
+	}
+}
+	   
diff --git a/Crux_Live_Jan22/src/Lec9/reversal_algo_ratate_array.java b/Crux_Live_Jan22/src/Lec9/reversal_algo_ratate_array.java
new file mode 100644
index 0000000..5303f8a
--- /dev/null
+++ b/Crux_Live_Jan22/src/Lec9/reversal_algo_ratate_array.java
@@ -0,0 +1,44 @@
+package Lec9;
+
+import java.util.Scanner;
+
+public class reversal_algo_ratate_array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int k=3;
+		rotatearray(arr,k);
+		for(int i=0;i<arr.length;i++)
+		{
+			System.out.println(arr[i]+" ");
+		}
+	}
+	public static void rotatearray(int[]arr,int k)
+	{
+		k=k%arr.length;
+		int n = arr.length;
+		reverse(arr,0,n-k-1);//1st n-k element ko rotate
+		reverse(arr,n-k,n-1);//n-k se last tak
+		reverse(arr,0,n-1);//whole array lo reverse
+	}
+public static void reverse(int[] arr,int i,int j)
+{    
+	while(i<j)
+	{
+		int temp=arr[i];
+		arr[i]=arr[j];
+		arr[j]=temp;
+		i++;
+		j--;
+	}
+	
+}
+}
diff --git a/Crux_Live_Jan22/src/Leetcode/Two_Sum.java b/Crux_Live_Jan22/src/Leetcode/Two_Sum.java
new file mode 100644
index 0000000..760ffd0
--- /dev/null
+++ b/Crux_Live_Jan22/src/Leetcode/Two_Sum.java
@@ -0,0 +1,10 @@
+package Leetcode;
+
+public class Two_Sum {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+	}
+
+}
diff --git a/Crux_Live_Jan22/src/Palindrome_substring.java b/Crux_Live_Jan22/src/Palindrome_substring.java
new file mode 100644
index 0000000..fdb0ecf
--- /dev/null
+++ b/Crux_Live_Jan22/src/Palindrome_substring.java
@@ -0,0 +1,39 @@
+import java.util.Scanner;
+
+public class Palindrome_substring {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		palindromesubstring(str);
+	}
+public static void palindromesubstring(String str)
+{
+	for(int i=0;i<str.length();i++)
+	{
+		for(int j = i+1;j<=str.length();j++)
+		{
+			String s1 = str.substring(i,j);
+			if(ispalindrome(s1)==true) {
+				System.out.println(s1);
+			}
+		}
+	}
+}
+public static boolean ispalindrome(String s)
+{
+	int i=0;
+	int j=s.length()-1;
+	while(i<j)
+	{
+		if(s.charAt(i)!=s.charAt(j))
+		{
+			return false;
+		}
+		i++;
+		j--;
+	}
+	return true;
+}
+}
diff --git a/Crux_Live_Jan22/src/Playing_with_good_substring.java b/Crux_Live_Jan22/src/Playing_with_good_substring.java
new file mode 100644
index 0000000..e3e0cd4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Playing_with_good_substring.java
@@ -0,0 +1,38 @@
+import java.util.Scanner;
+
+public class Playing_with_good_substring {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		String str = sc.next();
+		System.out.println(goodsubstring(str));
+	}
+public static int goodsubstring(String str)
+{ 
+	int ans=0;
+	int count=0;
+	for(int i=0;i<str.length();i++)
+	{
+		char ch = str.charAt(i);
+		if(vowels(ch)==true)
+		{
+			count++;
+		}
+		else
+		{
+			ans = Math.max(ans, count);
+			count=0;
+		}
+	}
+	ans = Math.max(ans, count);
+	return ans;
+}
+public static boolean vowels(char ch) {
+	if(ch=='a'|| ch=='e' ||ch=='i' || ch=='o'|| ch=='u' )
+	{
+		return true;
+	}
+	return false;
+}
+}
diff --git a/Crux_Live_Jan22/src/Reverse_within_range.java b/Crux_Live_Jan22/src/Reverse_within_range.java
new file mode 100644
index 0000000..6e8d2da
--- /dev/null
+++ b/Crux_Live_Jan22/src/Reverse_within_range.java
@@ -0,0 +1,34 @@
+import java.util.Scanner;
+
+public class Reverse_within_range {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		int i = 2;
+		int j=5;
+		reverse(arr,i,j);
+        for(int k=0;k<arr.length;k++)
+        {
+        	System.out.println(arr[k]);
+        }
+	}
+public static void reverse(int[] arr,int i,int j)
+{    
+	if(i<j)
+	{
+		int temp=arr[i];
+		arr[i]=arr[j];
+		arr[j]=temp;
+		i++;
+		j--;
+	}
+	
+}
+}
diff --git a/Crux_Live_Jan22/src/Rotate_array.java b/Crux_Live_Jan22/src/Rotate_array.java
new file mode 100644
index 0000000..3bf52b1
--- /dev/null
+++ b/Crux_Live_Jan22/src/Rotate_array.java
@@ -0,0 +1,32 @@
+import java.util.Scanner;
+
+public class Rotate_array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+     int k =sc.nextInt(); //for number of time rotation
+     rotatearray(arr,k);
+     for(int i=0;i<arr.length;i++)
+     {
+    	 System.out.println(arr[i]+" ");
+     }
+	}
+public static void rotatearray(int[]arr,int k)
+{
+	k=k%arr.length;
+	for(int j=1;j<=k;j++) {
+	int temp=arr[arr.length-1];
+	for(int i=arr.length-2;i>=0;i--)
+	{
+		arr[i+1]=arr[i];
+	}
+	arr[0]=temp;}
+}
+}
diff --git a/Crux_Live_Jan22/src/Sourse_destination.java b/Crux_Live_Jan22/src/Sourse_destination.java
new file mode 100644
index 0000000..8ebe4cd
--- /dev/null
+++ b/Crux_Live_Jan22/src/Sourse_destination.java
@@ -0,0 +1,39 @@
+import java.util.Scanner;
+
+public class Sourse_destination {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+
+		Scanner sc = new Scanner(System.in);
+	      int src=sc.nextInt();
+	      int des=sc.nextInt();
+	      int num=sc.nextInt();
+	      int multiplier=1;
+	      //logic
+	      //base 8 to base 10 conversion
+	      int dec=0;{
+	      while(num>0) {
+	          //divide by base 10
+	          int rem=num%10;
+	          num/=10;
+	          //multiply by power of src=base 8
+	          int value=rem*multiplier;
+	          //adding the values
+	          dec+=value;
+	          multiplier*=src;//changes(use src which you get as input)
+	      }
+	      //base 10 to base 2
+	      int bin=0;
+	      multiplier=1; 
+	      while(dec>0) {
+	          int rem=dec%des;//changes(use des which you got as input)
+	          dec=dec/des;//changes(use des which you got as input)
+	          //mul by 10
+	          int value=rem* multiplier;
+	          //adding values
+	          bin =bin +value;
+	          multiplier*=10;
+	      }
+	      System.out.println(bin);
+	}}}
\ No newline at end of file
diff --git a/Crux_Live_Jan22/src/Userinput_Array.java b/Crux_Live_Jan22/src/Userinput_Array.java
new file mode 100644
index 0000000..bc831b4
--- /dev/null
+++ b/Crux_Live_Jan22/src/Userinput_Array.java
@@ -0,0 +1,26 @@
+import java.util.Scanner;
+
+public class Userinput_Array {
+
+	public static void main(String[] args) {
+		// TODO Auto-generated method stub
+		Scanner sc = new Scanner(System.in);
+		int n = sc.nextInt();
+		int[] arr = new int[n];
+		for(int i=0;i<arr.length;i++)
+		{
+			arr[i]=sc.nextInt();
+		}
+		
+          display(arr);
+	}
+	public static void display(int[] arr)
+	{
+		for(int i =0;i<arr.length;i++)
+		{
+			System.out.println(arr[i]+" ");
+		}
+		System.out.println();
+	}
+
+}
