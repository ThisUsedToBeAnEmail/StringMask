# StringMask

```java

  String mask = new StringMask('thisusedtobeanemail@gmail.com', 'start', 5, '*'); # 'thisu************************'
  String mask = new StringMask('thisusedtobeanemail@gmail.com', 'middle', 5); # '************anema************'
  String mask = new StringMask('thisusedtobeanemail@gmail.com', 'end', 5, '*'); # '************************l.com'
  String mask = new StringMask('thisusedtobeanemail@gmail.com', 'email', 2); # 'thisusedtobean*****@*****.***'

```

Data masking or data obfuscation is the process of hiding original data with modified content (characters or other data). The main reason for applying masking to a string is to protect data that is classified as personally identifiable information, sensitive personal data, or commercially sensitive data. However, the data must remain usable for the purposes of undertaking valid test cycles. It must also look real and appear consistent.
