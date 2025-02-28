package org.example.open_api_kdigital.model;

public class WeatherInfoVO {
    private String resultCode;
    private String resultMsg;
    private String dataType;
    private String baseDate;
    private String baseTime;
    private String category;
    private int nx;
    private int ny;
    private String obsrValue;
    private String fcstTime;
    private String fcstDate;
    private String fcstValue;

    public String getFcstTime() {
        return fcstTime;
    }

    public void setFcstTime(String fcstTime) {
        this.fcstTime = fcstTime;
    }

    public String getFcstDate() {
        return fcstDate;
    }

    public void setFcstDate(String fcstDate) {
        this.fcstDate = fcstDate;
    }

    public String getFcstValue() {
        return fcstValue;
    }

    public void setFcstValue(String fcstValue) {
        this.fcstValue = fcstValue;
    }

    public String getResultCode() { return resultCode; }
    public void setResultCode(String resultCode) { this.resultCode = resultCode; }

    public String getResultMsg() { return resultMsg; }
    public void setResultMsg(String resultMsg) { this.resultMsg = resultMsg; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }

    public String getBaseDate() { return baseDate; }
    public void setBaseDate(String baseDate) { this.baseDate = baseDate; }

    public String getBaseTime() { return baseTime; }
    public void setBaseTime(String baseTime) { this.baseTime = baseTime; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getNx() { return nx; }
    public void setNx(int nx) { this.nx = nx; }

    public int getNy() { return ny; }
    public void setNy(int ny) { this.ny = ny; }

    public String getObsrValue() { return obsrValue; }
    public void setObsrValue(String obsrValue) { this.obsrValue = obsrValue; }

    public String toString() {
        return "WeatherInfoVO [resultCode=" + resultCode
                + ", resultMsg=" + resultMsg
                + ", dataType=" + dataType
                + ", baseDate=" + baseDate
                + ", baseTime=" + baseTime
                + ", category=" + category
                + ", nx=" + nx
                + ", ny=" + ny
                + ", obsrValue=" + obsrValue
                + ", fcseDate=" + fcstDate
                + ", fcseTime=" + fcstTime
                + ", fcseValue=" + fcstValue
                + ", getresultCode()=" + getResultCode()
                + ", getResultMsg()=" + getResultMsg()
                + ", getDataType()=" + getDataType()
                + ", getBaseDate()=" + getBaseDate()
                + ", getBaseTime()=" + getBaseTime()
                + ", getCategory()=" + getCategory()
                + ", getNx()=" + getNx()
                + ", getNy()=" + getNy()
                + ", getFcstDate()=" + getFcstDate()
                + ", getFcstTime()=" + getFcstTime()
                + ", getFcstValue()=" + getFcstValue()
                + ", getObsrValue()=" + getObsrValue()
                + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";

    }
}
