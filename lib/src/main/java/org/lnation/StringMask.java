package org.lnation.StringMask;

import java.util.stream.Collectors;
import java.util.Arrays;

public class StringMask {
	public static String main(String[] args) {
		String str = args[0];
		String pos; int length; String mask_char;
		try {
			pos = args[1];
			length = Integer.parseInt(args[2]);
			mask_char = args[3];
		} catch (NumberFormatException e) {
			pos = "start";
			length = 5;
			mask_char = "*";
		}
		return mask(str, pos, length, mask_char);
	}
	public static String mask(String str, String pos, int length, String mask_char) {
		String mask = mask_char.repeat(length);
		String out = ""; String start = ""; String end = "";
		switch (pos) {
			case "email":
				String[] spl = str.split("@");
				start = spl[0].substring(0, spl[0].length() - length);
				end = Arrays.asList(spl[1].split("\\.")).stream().map(k -> mask_char.repeat(k.length())).collect(Collectors.joining("."));
				out = start + mask + "@" + end;
				break;
			case "middle":
				int len = (str.length() - length) / 2;
				start = str.substring(0, (int)(len));
				end = str.substring(length + (int)(len + 0.5), str.length());
				out = start + mask + end;
				break;
			case "end":
				start = str.substring(0, str.length() - length);
				out = start + mask;
				break;
			default:
				end = str.substring(length, str.length());
				out =  mask + end;
				break;

		};
		return out;
	}
}
