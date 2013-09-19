package edu.ucla.library.libservices.rswrapper.roomsched;

import java.util.Date;

public class AvailableTime
{
  private Date start;
  private Date end;

  public AvailableTime()
  {
  }

  public AvailableTime( Date start, Date end )
  {
    this.start = start;
    this.end = end;
  }

  public Date getStart()
  {
    return start;
  }

  public void setStart( Date start )
  {
    this.start = start;
  }

  public Date getEnd()
  {
    return end;
  }

  public void setEnd( Date end )
  {
    this.end = end;
  }

  public String toString()
  {
    return start + " - " + end;
  }
}
