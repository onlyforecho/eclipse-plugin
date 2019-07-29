package com.aixcoder.i18n;

import java.util.HashMap;
import java.util.Map;

public class ZH extends Localization {
	public static final String id = "zh-cn";
	public static final String display = "\u7b80\u4f53\u4e2d\u6587(Chinese Simplified)";
	static Map<String, String> m = new HashMap<String, String>();
	static {
//		m.put(enableAiXCoder, "启用aiXcoder(&e)");
		m.put(enableAiXCoder, "\u542f\u7528aiXcoder(&e)");
//		m.put(serverURL, "预测服务器地址(&s)");
		m.put(serverURL, "\u9884\u6d4b\u670d\u52a1\u5668\u5730\u5740(&s)");
//		m.put(searchURL, "搜索服务器地址(&h)");
		m.put(searchURL, "\u641c\u7d22\u670d\u52a1\u5668\u5730\u5740(&h)");
//		m.put(autoImportClasses, "自动导入类引用(&i)");
		m.put(autoImportClasses, "\u81ea\u52a8\u5bfc\u5165\u7c7b\u5f15\u7528(&i)");
//		m.put(sortOnly, "仅显示排序（会稍微降低延迟）(&o)");
		m.put(sortOnly, "\u4ec5\u663e\u793a\u6392\u5e8f\uff08\u4f1a\u7a0d\u5fae\u964d\u4f4e\u5ef6\u8fdf\uff09(&o)");
//		m.put(allowTelemetry, "允许发送使用数据(&t)");
		m.put(allowTelemetry, "\u5141\u8bb8\u53d1\u9001\u4f7f\u7528\u6570\u636e(&t)");
//		m.put(language, "语言🌏（需要重新打开设置页面）(&l)");
		m.put(language, "\u8bed\u8a00\ud83c\udf0f\uff08\u9700\u8981\u91cd\u65b0\u6253\u5f00\u8bbe\u7f6e\u9875\u9762\uff09(&l)");
//		m.put(model, "模型(&m)");
		m.put(model, "\u6a21\u578b(&m)");
//		m.put(additionalParameters, "额外参数(&p)");
		m.put(additionalParameters, "\u989d\u5916\u53c2\u6570(&p)");
//		m.put(description, "AiXCoder是一个AI驱动的代码补全服务。访问 https://aixcoder.com 获得更多信息。");
		m.put(description, "AiXCoder\u662f\u4e00\u4e2aAI\u9a71\u52a8\u7684\u4ee3\u7801\u8865\u5168\u670d\u52a1\u3002\u8bbf\u95ee https://aixcoder.com \u83b7\u5f97\u66f4\u591a\u4fe1\u606f\u3002");
//		m.put(telemetryTitle, "AiXCoder用户使用信息收集");
		m.put(telemetryTitle, "AiXCoder\u7528\u6237\u4f7f\u7528\u4fe1\u606f\u6536\u96c6");
//		m.put(telemetryQuestion, "您愿意发送匿名的使用数据以提高未来的用户体验吗？您可以稍后在设置页里修改这个设置。");
		m.put(telemetryQuestion, "\u60a8\u613f\u610f\u53d1\u9001\u533f\u540d\u7684\u4f7f\u7528\u6570\u636e\u4ee5\u63d0\u9ad8\u672a\u6765\u7684\u7528\u6237\u4f53\u9a8c\u5417\uff1f\u60a8\u53ef\u4ee5\u7a0d\u540e\u5728\u8bbe\u7f6e\u9875\u91cc\u4fee\u6539\u8fd9\u4e2a\u8bbe\u7f6e\u3002");
//		m.put(endpointEmptyTitle, "AiXCoder预测服务器地址为空!");
		m.put(endpointEmptyTitle, "AiXCoder\u9884\u6d4b\u670d\u52a1\u5668\u5730\u5740\u4e3a\u7a7a!");
//		m.put(endpointEmptyWarning, "AiXCoder预测服务器地址未被设置。 请在Window->Preferences->AiXCoder Preferences设置页面中手动设置。我们的公用地址是 https://api.aixcoder.com/");
		m.put(endpointEmptyWarning, "AiXCoder\u9884\u6d4b\u670d\u52a1\u5668\u5730\u5740\u672a\u88ab\u8bbe\u7f6e\u3002\u0020\u0020\u8bf7\u5728Window->Preferences->AiXCoder Preferences\u8bbe\u7f6e\u9875\u9762\u4e2d\u624b\u52a8\u8bbe\u7f6e\u3002\u6211\u4eec\u7684\u516c\u7528\u5730\u5740\u662f https://api.aixcoder.com/");
//		m.put(longResultRank, "长推荐结果排序位置");
		m.put(longResultRank, "\u957f\u63a8\u8350\u7ed3\u679c\u6392\u5e8f\u4f4d\u7f6e");
//		m.put(longResultCut, "更短的结果的数量");
		m.put(longResultCut, "\u66f4\u77ed\u7684\u7ed3\u679c\u7684\u6570\u91cf");
//		m.put(longResultCutAuto, "自动");
		m.put(longResultCutAuto, "\u81ea\u52a8");
//		m.put(longResultCut0, "0-无");
		m.put(longResultCut0, "0-\u65e0");
		m.put(longResultCut1, "1");
		m.put(longResultCut2, "2");
		m.put(longResultCut3, "3");
		m.put(longResultCut4, "4");
		m.put(longResultCut5, "5");
//		m.put(longResultCutSort, "更短结果的顺序");
		m.put(longResultCutSort, "\u66f4\u77ed\u7ed3\u679c\u7684\u987a\u5e8f");
//		m.put(longResultCutS2L, "从短到长");
		m.put(longResultCutS2L, "\u4ece\u77ed\u5230\u957f");
//		m.put(longResultCutL2S, "从长到短");
		m.put(longResultCutL2S, "\u4ece\u957f\u5230\u77ed");
	}

	public static String R(String input) {
		if (m.containsKey(input))
			return m.get(input);
		return input;
	}
}
