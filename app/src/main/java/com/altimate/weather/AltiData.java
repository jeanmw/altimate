package com.altimate.weather;


/**
 * Created by jeanweatherwax on 6/21/15.
 */
public class AltiData {
  private long timestamp;
  private double x;


  public AltiData(long timestamp, double x) {
    this.timestamp = timestamp;
    this.x = x;
  }
  public long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
  public double getX() {
    return x;
  }
  public void setX(double x) {
    this.x = x;
  }


  public String toString()
  {
    return "t="+timestamp+", x="+x;
  }
}
