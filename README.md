# StringMask

```java

StringMask mask = new StringMask();

mask.mask("thisusedtobeanemail@gmail.com", "start", 5, "*"); # *****sedtobeanemail@gmail.com
mask.mask("thisusedtobeanemail@gmail.com", "middle", 5, "*"); # thisusedtobe*****il@gmail.com
mask.mask("thisusedtobeanemail@gmail.com", "end", 5, "*"); # thisusedtobeanemail@gmai*****
mask.mask("thisusedtobeanemail@gmail.com", "email", 5, "*"); # thisusedtobean*****@*****.***"

```

Data masking or data obfuscation is the process of hiding original data with modified content (characters or other data). The main reason for applying masking to a string is to protect data that is classified as personally identifiable information, sensitive personal data, or commercially sensitive data. However, the data must remain usable for the purposes of undertaking valid test cycles. It must also look real and appear consistent.
