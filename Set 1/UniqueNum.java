/*
 * WAP to generate all n digit unique numbers
 */
class UniqueNum
 {
     static boolean isUnique(int a)
     {
         int count=0;int flag=0;
         for(int i=0;i<10;i++)
         {
         count=0;int copy=a;
         while(copy>0)
         {
             int dig=copy%10;
             if(dig==i)
             count++;
             copy/=10;
            }
         if(count>1)
          flag=1;
        }
        if(flag==0)
        return true;
        return false;
    }
     static void main(int n)
     {
         for(int i=(int)Math.pow(10,n-1);i<(int)Math.pow(10,n);i++)
         {
             if(isUnique(i))
             System.out.println(i);
            }
        }       
    }
    /*
     * 10
12
13
14
15
16
17
18
19
20
21
23
24
25
26
27
28
29
30
31
32
34
35
36
37
38
39
40
41
42
43
45
46
47
48
49
50
51
52
53
54
56
57
58
59
60
61
62
63
64
65
67
68
69
70
71
72
73
74
75
76
78
79
80
81
82
83
84
85
86
87
89
90
91
92
93
94
95
96
97
98

     */