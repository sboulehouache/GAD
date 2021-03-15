/**
 * 
 */


import javax.management.NotificationBroadcaster;

/**
 * @author soufiane
 *
 */
public interface SensorMBean extends NotificationBroadcaster{
	// getter/setter
	public double getValue();
	public void setValue(double val);
	// operations
	public void reset(int r, String message);
}
