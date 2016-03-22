package com.nicole.weather.modle;

import java.util.List;

/**
 * Created by kevin .
 */
public class WeatherEntity {

    /**
     * city : {"aqi":"113","co":"2","no2":"65","o3":"32","pm10":"160","pm25":"84","qlty":"轻度污染","so2":"20"}
     */

    public AqiBean aqi;
    /**
     * city : 西安
     * cnty : 中国
     * id : CN101110101
     * lat : 34.285000
     * lon : 108.969000
     * update : {"loc":"2016-03-22 10:53","utc":"2016-03-22 02:53"}
     */

    public BasicBean basic;
    /**
     * cond : {"code":"104","txt":"阴"}
     * fl : 10
     * hum : 63
     * pcpn : 0
     * pres : 1018
     * tmp : 11
     * vis : 3
     * wind : {"deg":"50","dir":"东风","sc":"4-5","spd":"21"}
     */

    public NowBean now;
    /**
     * aqi : {"city":{"aqi":"113","co":"2","no2":"65","o3":"32","pm10":"160","pm25":"84","qlty":"轻度污染","so2":"20"}}
     * basic : {"city":"西安","cnty":"中国","id":"CN101110101","lat":"34.285000","lon":"108.969000","update":{"loc":"2016-03-22 10:53","utc":"2016-03-22 02:53"}}
     * daily_forecast : [{"astro":{"sr":"06:44","ss":"18:57"},"cond":{"code_d":"104","code_n":"305","txt_d":"阴","txt_n":"小雨"},"date":"2016-03-22","hum":"39","pcpn":"0.0","pop":"0","pres":"1015","tmp":{"max":"13","min":"10"},"vis":"10","wind":{"deg":"12","dir":"西南风","sc":"微风","spd":"10"}},{"astro":{"sr":"06:43","ss":"18:58"},"cond":{"code_d":"305","code_n":"104","txt_d":"小雨","txt_n":"阴"},"date":"2016-03-23","hum":"37","pcpn":"0.1","pop":"35","pres":"1025","tmp":{"max":"13","min":"8"},"vis":"10","wind":{"deg":"49","dir":"西南风","sc":"微风","spd":"5"}},{"astro":{"sr":"06:41","ss":"18:58"},"cond":{"code_d":"104","code_n":"104","txt_d":"阴","txt_n":"阴"},"date":"2016-03-24","hum":"39","pcpn":"0.3","pop":"10","pres":"1027","tmp":{"max":"16","min":"8"},"vis":"10","wind":{"deg":"262","dir":"西南风","sc":"微风","spd":"8"}},{"astro":{"sr":"06:40","ss":"18:59"},"cond":{"code_d":"101","code_n":"100","txt_d":"多云","txt_n":"晴"},"date":"2016-03-25","hum":"27","pcpn":"0.2","pop":"0","pres":"1027","tmp":{"max":"16","min":"4"},"vis":"10","wind":{"deg":"189","dir":"东北风","sc":"微风","spd":"10"}},{"astro":{"sr":"06:38","ss":"19:00"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2016-03-26","hum":"16","pcpn":"0.0","pop":"0","pres":"1025","tmp":{"max":"18","min":"3"},"vis":"10","wind":{"deg":"174","dir":"东北风","sc":"微风","spd":"9"}},{"astro":{"sr":"06:37","ss":"19:01"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2016-03-27","hum":"15","pcpn":"0.0","pop":"0","pres":"1016","tmp":{"max":"20","min":"8"},"vis":"10","wind":{"deg":"49","dir":"东北风","sc":"微风","spd":"9"}},{"astro":{"sr":"06:36","ss":"19:02"},"cond":{"code_d":"104","code_n":"307","txt_d":"阴","txt_n":"大雨"},"date":"2016-03-28","hum":"17","pcpn":"0.2","pop":"45","pres":"1019","tmp":{"max":"22","min":"8"},"vis":"10","wind":{"deg":"261","dir":"东北风","sc":"微风","spd":"9"}}]
     * hourly_forecast : [{"date":"2016-03-22 10:00","hum":"45","pop":"0","pres":"1018","tmp":"15","wind":{"deg":"32","dir":"东北风","sc":"微风","spd":"13"}},{"date":"2016-03-22 13:00","hum":"40","pop":"0","pres":"1016","tmp":"19","wind":{"deg":"17","dir":"东北风","sc":"微风","spd":"7"}},{"date":"2016-03-22 16:00","hum":"38","pop":"0","pres":"1015","tmp":"21","wind":{"deg":"15","dir":"东北风","sc":"微风","spd":"3"}},{"date":"2016-03-22 19:00","hum":"46","pop":"0","pres":"1017","tmp":"20","wind":{"deg":"124","dir":"东南风","sc":"微风","spd":"3"}},{"date":"2016-03-22 22:00","hum":"50","pop":"0","pres":"1020","tmp":"18","wind":{"deg":"241","dir":"西南风","sc":"微风","spd":"6"}}]
     * now : {"cond":{"code":"104","txt":"阴"},"fl":"10","hum":"63","pcpn":"0","pres":"1018","tmp":"11","vis":"3","wind":{"deg":"50","dir":"东风","sc":"4-5","spd":"21"}}
     * status : ok
     * suggestion : {"comf":{"brf":"较舒适","txt":"白天天气阴沉，会感到有点儿凉，但大部分人完全可以接受。"},"cw":{"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},"drsg":{"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"},"flu":{"brf":"极易发","txt":"将有一次强降温过程，天气寒冷，极易发生感冒，请特别注意增加衣服保暖防寒。"},"sport":{"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"},"trav":{"brf":"适宜","txt":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。"},"uv":{"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}}
     */

    public String status;
    /**
     * comf : {"brf":"较舒适","txt":"白天天气阴沉，会感到有点儿凉，但大部分人完全可以接受。"}
     * cw : {"brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"}
     * drsg : {"brf":"较冷","txt":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"}
     * flu : {"brf":"极易发","txt":"将有一次强降温过程，天气寒冷，极易发生感冒，请特别注意增加衣服保暖防寒。"}
     * sport : {"brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"}
     * trav : {"brf":"适宜","txt":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。"}
     * uv : {"brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"}
     */

    public SuggestionBean suggestion;
    /**
     * astro : {"sr":"06:44","ss":"18:57"}
     * cond : {"code_d":"104","code_n":"305","txt_d":"阴","txt_n":"小雨"}
     * date : 2016-03-22
     * hum : 39
     * pcpn : 0.0
     * pop : 0
     * pres : 1015
     * tmp : {"max":"13","min":"10"}
     * vis : 10
     * wind : {"deg":"12","dir":"西南风","sc":"微风","spd":"10"}
     */

    public List<DailyForecastBean> daily_forecast;
    /**
     * date : 2016-03-22 10:00
     * hum : 45
     * pop : 0
     * pres : 1018
     * tmp : 15
     * wind : {"deg":"32","dir":"东北风","sc":"微风","spd":"13"}
     */

    public List<HourlyForecastBean> hourly_forecast;

    public static class AqiBean {
        /**
         * aqi : 113
         * co : 2
         * no2 : 65
         * o3 : 32
         * pm10 : 160
         * pm25 : 84
         * qlty : 轻度污染
         * so2 : 20
         */

        public CityBean city;

        public static class CityBean {
            public String aqi;
            public String co;
            public String no2;
            public String o3;
            public String pm10;
            public String pm25;
            public String qlty;
            public String so2;
        }
    }

    public static class BasicBean {
        public String city;
        public String cnty;
        public String id;
        public String lat;
        public String lon;
        /**
         * loc : 2016-03-22 10:53
         * utc : 2016-03-22 02:53
         */

        public UpdateBean update;

        public static class UpdateBean {
            public String loc;
            public String utc;
        }
    }

    public static class NowBean {
        /**
         * code : 104
         * txt : 阴
         */

        public CondBean cond;
        public String fl;
        public String hum;
        public String pcpn;
        public String pres;
        public String tmp;
        public String vis;
        /**
         * deg : 50
         * dir : 东风
         * sc : 4-5
         * spd : 21
         */

        public WindBean wind;

        public static class CondBean {
            public String code;
            public String txt;
        }

        public static class WindBean {
            public String deg;
            public String dir;
            public String sc;
            public String spd;
        }
    }

    public static class SuggestionBean {
        /**
         * brf : 较舒适
         * txt : 白天天气阴沉，会感到有点儿凉，但大部分人完全可以接受。
         */

        public ComfBean comf;
        /**
         * brf : 不宜
         * txt : 不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。
         */

        public CwBean cw;
        /**
         * brf : 较冷
         * txt : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
         */

        public DrsgBean drsg;
        /**
         * brf : 极易发
         * txt : 将有一次强降温过程，天气寒冷，极易发生感冒，请特别注意增加衣服保暖防寒。
         */

        public FluBean flu;
        /**
         * brf : 较适宜
         * txt : 阴天，较适宜进行各种户内外运动。
         */

        public SportBean sport;
        /**
         * brf : 适宜
         * txt : 天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。
         */

        public TravBean trav;
        /**
         * brf : 最弱
         * txt : 属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。
         */

        public UvBean uv;

        public static class ComfBean {
            public String brf;
            public String txt;
        }

        public static class CwBean {
            public String brf;
            public String txt;
        }

        public static class DrsgBean {
            public String brf;
            public String txt;
        }

        public static class FluBean {
            public String brf;
            public String txt;
        }

        public static class SportBean {
            public String brf;
            public String txt;
        }

        public static class TravBean {
            public String brf;
            public String txt;
        }

        public static class UvBean {
            public String brf;
            public String txt;
        }
    }

    public static class DailyForecastBean {
        /**
         * sr : 06:44
         * ss : 18:57
         */

        public AstroBean astro;
        /**
         * code_d : 104
         * code_n : 305
         * txt_d : 阴
         * txt_n : 小雨
         */

        public CondBean cond;
        public String date;
        public String hum;
        public String pcpn;
        public String pop;
        public String pres;
        /**
         * max : 13
         * min : 10
         */

        public TmpBean tmp;
        public String vis;
        /**
         * deg : 12
         * dir : 西南风
         * sc : 微风
         * spd : 10
         */

        public WindBean wind;

        public static class AstroBean {
            public String sr;
            public String ss;
        }

        public static class CondBean {
            public String code_d;
            public String code_n;
            public String txt_d;
            public String txt_n;
        }

        public static class TmpBean {
            public String max;
            public String min;
        }

        public static class WindBean {
            public String deg;
            public String dir;
            public String sc;
            public String spd;
        }
    }

    public static class HourlyForecastBean {
        public String date;
        public String hum;
        public String pop;
        public String pres;
        public String tmp;
        /**
         * deg : 32
         * dir : 东北风
         * sc : 微风
         * spd : 13
         */

        public WindBean wind;

        public static class WindBean {
            public String deg;
            public String dir;
            public String sc;
            public String spd;
        }
    }
}
