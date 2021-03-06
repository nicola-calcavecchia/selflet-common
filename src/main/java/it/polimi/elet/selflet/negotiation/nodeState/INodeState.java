package it.polimi.elet.selflet.negotiation.nodeState;

import it.polimi.elet.selflet.id.ISelfLetID;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * This interface represents the state of a node.
 * 
 * Classes implementing this interface are passed within the SelfLetMsg
 * messages.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public interface INodeState extends Serializable {

	/**
	 * The ID of the selflet to which this state is referring to
	 * */
	ISelfLetID getSelfletID();

	/**
	 * @return returns all available services at the node
	 */
	Set<String> getAvailableServices();

	/**
	 * Adds a set of services which are available at this node
	 * */
	void addAvailableServices(Set<String> availableServices);

	/**
	 * Returns the timestamp of this node state creation time
	 * */
	Date getTimeStamp();

	/**
	 * Adds a map of generic data to this node state
	 * */
	void addGenericData(Map<String, Serializable> genericData);

	/**
	 * Returns the set of known neighbors
	 * */
	Set<ISelfLetID> getKnownNeighbors();

	/**
	 * Adds the set of known neighbors by this node
	 * */
	void addKnownNeighbors(Set<ISelfLetID> knownNeighbors);

	/**
	 * Returns the set of associated generic data associated to this node state
	 * */
	Map<String, Serializable> getGenericData();

	/**
	 * Return the generic data associated with the given key
	 * */
	Serializable getGenericDataWithKey(String key);

	double getUtilization();

	void setUtilization(double currentTotalCPUUtilization);

	/**
	 * Returns the CPU utilization upper bound
	 * 
	 * @return CPU utilization upper bound
	 */
	double getUtilizationUpperBound();

	/**
	 * Set the current CPU utilization upper bound
	 * 
	 * @param currentUtilizationUpperBound
	 *            Current CPU utilization upper bound
	 */
	void setUtilizationUpperBound(double currentUtilizationUpperBound);
	
	public Map<String, Long> getResponseTimes();

	public void setResponseTimes(Map<String, Long> responseTimeOfServices);
	
	public long getResponseTimeOfService(String serviceName);
}
