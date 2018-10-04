package com.coolweather.android.coolweather.mvp.model.bean;

import java.util.List;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class Detailsbean {


    private List<HeWeatherBean> HeWeather;

    public List<HeWeatherBean> getHeWeather() {
        return HeWeather;
    }

    public void setHeWeather(List<HeWeatherBean> HeWeather) {
        this.HeWeather = HeWeather;
    }

    public static class HeWeatherBean {
        /**
         * basic : {"cid":"CN101190401","location":"苏州","parent_city":"苏州","admin_area":"江苏","cnty":"中国","lat":"31.29937935","lon":"120.61958313","tz":"+8.00","city":"苏州","id":"CN101190401","update":{"loc":"2018-10-04 12:45","utc":"2018-10-04 04:45"}}
         * update : {"loc":"2018-10-04 12:45","utc":"2018-10-04 04:45"}
         * status : ok
         * now : {"cloud":"9","cond_code":"101","cond_txt":"多云","fl":"23","hum":"47","pcpn":"0.0","pres":"1021","tmp":"25","vis":"20","wind_deg":"355","wind_dir":"北风","wind_sc":"3","wind_spd":"19","cond":{"code":"101","txt":"多云"}}
         * daily_forecast : [{"date":"2018-10-04","cond":{"txt_d":"多云"},"tmp":{"max":"26","min":"19"}},{"date":"2018-10-05","cond":{"txt_d":"阴"},"tmp":{"max":"24","min":"19"}},{"date":"2018-10-06","cond":{"txt_d":"阴"},"tmp":{"max":"26","min":"17"}},{"date":"2018-10-07","cond":{"txt_d":"多云"},"tmp":{"max":"26","min":"17"}},{"date":"2018-10-08","cond":{"txt_d":"多云"},"tmp":{"max":"25","min":"19"}},{"date":"2018-10-09","cond":{"txt_d":"阴"},"tmp":{"max":"25","min":"15"}},{"date":"2018-10-10","cond":{"txt_d":"多云"},"tmp":{"max":"23","min":"19"}}]
         * hourly : [{"cloud":"22","cond_code":"100","cond_txt":"晴","dew":"12","hum":"58","pop":"0","pres":"1019","time":"2018-10-04 16:00","tmp":"24","wind_deg":"42","wind_dir":"东北风","wind_sc":"4-5","wind_spd":"31"},{"cloud":"1","cond_code":"100","cond_txt":"晴","dew":"14","hum":"63","pop":"0","pres":"1017","time":"2018-10-04 19:00","tmp":"21","wind_deg":"60","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"14"},{"cloud":"1","cond_code":"100","cond_txt":"晴","dew":"14","hum":"70","pop":"0","pres":"1017","time":"2018-10-04 22:00","tmp":"19","wind_deg":"50","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"24"},{"cloud":"3","cond_code":"101","cond_txt":"多云","dew":"15","hum":"76","pop":"0","pres":"1018","time":"2018-10-05 01:00","tmp":"19","wind_deg":"35","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"22"},{"cloud":"17","cond_code":"101","cond_txt":"多云","dew":"15","hum":"78","pop":"0","pres":"1018","time":"2018-10-05 04:00","tmp":"19","wind_deg":"58","wind_dir":"东北风","wind_sc":"4-5","wind_spd":"28"},{"cloud":"56","cond_code":"101","cond_txt":"多云","dew":"17","hum":"79","pop":"0","pres":"1014","time":"2018-10-05 07:00","tmp":"19","wind_deg":"26","wind_dir":"东北风","wind_sc":"4-5","wind_spd":"29"},{"cloud":"83","cond_code":"104","cond_txt":"阴","dew":"16","hum":"75","pop":"0","pres":"1013","time":"2018-10-05 10:00","tmp":"22","wind_deg":"135","wind_dir":"东南风","wind_sc":"6-7","wind_spd":"49"},{"cloud":"61","cond_code":"300","cond_txt":"阵雨","dew":"14","hum":"79","pop":"11","pres":"1011","time":"2018-10-05 13:00","tmp":"24","wind_deg":"8","wind_dir":"北风","wind_sc":"5-6","wind_spd":"44"}]
         * aqi : {"city":{"aqi":"49","pm25":"22","qlty":"优"}}
         * suggestion : {"comf":{"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},"sport":{"type":"sport","brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"},"cw":{"type":"cw","brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"}}
         */

        private BasicBean basic;
        private UpdateBeanX update;
        private String status;
        private NowBean now;
        private AqiBean aqi;
        private SuggestionBean suggestion;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBeanX getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBeanX update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public static class BasicBean {
            /**
             * cid : CN101190401
             * location : 苏州
             * parent_city : 苏州
             * admin_area : 江苏
             * cnty : 中国
             * lat : 31.29937935
             * lon : 120.61958313
             * tz : +8.00
             * city : 苏州
             * id : CN101190401
             * update : {"loc":"2018-10-04 12:45","utc":"2018-10-04 04:45"}
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;
            private String city;
            private String id;
            private UpdateBean update;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public UpdateBean getUpdate() {
                return update;
            }

            public void setUpdate(UpdateBean update) {
                this.update = update;
            }

            public static class UpdateBean {
                /**
                 * loc : 2018-10-04 12:45
                 * utc : 2018-10-04 04:45
                 */

                private String loc;
                private String utc;

                public String getLoc() {
                    return loc;
                }

                public void setLoc(String loc) {
                    this.loc = loc;
                }

                public String getUtc() {
                    return utc;
                }

                public void setUtc(String utc) {
                    this.utc = utc;
                }
            }
        }

        public static class UpdateBeanX {
            /**
             * loc : 2018-10-04 12:45
             * utc : 2018-10-04 04:45
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 9
             * cond_code : 101
             * cond_txt : 多云
             * fl : 23
             * hum : 47
             * pcpn : 0.0
             * pres : 1021
             * tmp : 25
             * vis : 20
             * wind_deg : 355
             * wind_dir : 北风
             * wind_sc : 3
             * wind_spd : 19
             * cond : {"code":"101","txt":"多云"}
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;
            private CondBean cond;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }

            public CondBean getCond() {
                return cond;
            }

            public void setCond(CondBean cond) {
                this.cond = cond;
            }

            public static class CondBean {
                /**
                 * code : 101
                 * txt : 多云
                 */

                private String code;
                private String txt;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class AqiBean {
            /**
             * city : {"aqi":"49","pm25":"22","qlty":"优"}
             */

            private CityBean city;

            public CityBean getCity() {
                return city;
            }

            public void setCity(CityBean city) {
                this.city = city;
            }

            public static class CityBean {
                /**
                 * aqi : 49
                 * pm25 : 22
                 * qlty : 优
                 */

                private String aqi;
                private String pm25;
                private String qlty;

                public String getAqi() {
                    return aqi;
                }

                public void setAqi(String aqi) {
                    this.aqi = aqi;
                }

                public String getPm25() {
                    return pm25;
                }

                public void setPm25(String pm25) {
                    this.pm25 = pm25;
                }

                public String getQlty() {
                    return qlty;
                }

                public void setQlty(String qlty) {
                    this.qlty = qlty;
                }
            }
        }

        public static class SuggestionBean {
            /**
             * comf : {"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"}
             * sport : {"type":"sport","brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"}
             * cw : {"type":"cw","brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"}
             */

            private ComfBean comf;
            private SportBean sport;
            private CwBean cw;

            public ComfBean getComf() {
                return comf;
            }

            public void setComf(ComfBean comf) {
                this.comf = comf;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public CwBean getCw() {
                return cw;
            }

            public void setCw(CwBean cw) {
                this.cw = cw;
            }

            public static class ComfBean {
                /**
                 * type : comf
                 * brf : 舒适
                 * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
                 */

                private String type;
                private String brf;
                private String txt;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class SportBean {
                /**
                 * type : sport
                 * brf : 较适宜
                 * txt : 天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。
                 */

                private String type;
                private String brf;
                private String txt;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }

            public static class CwBean {
                /**
                 * type : cw
                 * brf : 较不宜
                 * txt : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
                 */

                private String type;
                private String brf;
                private String txt;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getBrf() {
                    return brf;
                }

                public void setBrf(String brf) {
                    this.brf = brf;
                }

                public String getTxt() {
                    return txt;
                }

                public void setTxt(String txt) {
                    this.txt = txt;
                }
            }
        }

        public static class DailyForecastBean {
            /**
             * date : 2018-10-04
             * cond : {"txt_d":"多云"}
             * tmp : {"max":"26","min":"19"}
             */

            private String date;
            private CondBeanX cond;
            private TmpBean tmp;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public CondBeanX getCond() {
                return cond;
            }

            public void setCond(CondBeanX cond) {
                this.cond = cond;
            }

            public TmpBean getTmp() {
                return tmp;
            }

            public void setTmp(TmpBean tmp) {
                this.tmp = tmp;
            }

            public static class CondBeanX {
                /**
                 * txt_d : 多云
                 */

                private String txt_d;

                public String getTxt_d() {
                    return txt_d;
                }

                public void setTxt_d(String txt_d) {
                    this.txt_d = txt_d;
                }
            }

            public static class TmpBean {
                /**
                 * max : 26
                 * min : 19
                 */

                private String max;
                private String min;

                public String getMax() {
                    return max;
                }

                public void setMax(String max) {
                    this.max = max;
                }

                public String getMin() {
                    return min;
                }

                public void setMin(String min) {
                    this.min = min;
                }
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 22
             * cond_code : 100
             * cond_txt : 晴
             * dew : 12
             * hum : 58
             * pop : 0
             * pres : 1019
             * time : 2018-10-04 16:00
             * tmp : 24
             * wind_deg : 42
             * wind_dir : 东北风
             * wind_sc : 4-5
             * wind_spd : 31
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew() {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }
    }
}
