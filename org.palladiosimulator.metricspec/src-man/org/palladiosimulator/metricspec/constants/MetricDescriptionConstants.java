package org.palladiosimulator.metricspec.constants;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;

/**
 * Constant metric descriptions, commonly used by ProbeFramework.
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public final class MetricDescriptionConstants {
    private static final String PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC = "pathmap://METRIC_SPEC_MODELS/commonMetrics.metricspec";

    static {
        final MetricSpecPackage msPackage = MetricSpecPackage.eINSTANCE;
        final MetricSpecFactory msFactory = MetricSpecFactory.eINSTANCE;

        final ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.createResource(URI.createURI(PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC, true));
        try {
            resource.load(Collections.EMPTY_MAP);
        } catch (final IOException e) {
            // TODO Auto-generated catch block. Use eclipse error log instead?
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        RESPONSE_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_6rYmYs7nEeOX_4BzImuHbA");
        POINT_IN_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_NCRBos7pEeOX_4BzImuHbA");
        HOLD_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_zETOUs7pEeOX_4BzImuHbA");
        WAITING_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_QWjAYs7qEeOX_4BzImuHbA");
        RESOURCE_DEMAND_METRIC = (BaseMetricDescription) resource.getEObject("_eg_F0s7qEeOX_4BzImuHbA");
        CPU_STATE_METRIC = (BaseMetricDescription) resource.getEObject("_paDhIs7qEeOX_4BzImuHbA");
        PASSIVE_RESOURCE_STATE_METRIC = (BaseMetricDescription) resource.getEObject("_x0-pks7rEeOX_4BzImuHbA");
        EXECUTION_RESULT_METRIC = (BaseMetricDescription) resource.getEObject("_7Is3ss7rEeOX_4BzImuHbA");
        CPU_STATE_OVER_TIME_METRIC = (MetricSetDescription) resource.getEObject("_MSlw0c7sEeOX_4BzImuHbA");
        SCALABILITY_RANGE = (BaseMetricDescription) resource.getEObject("_gNxNEtBxEeONzY86HEL4JQ");
        SLOPE = (BaseMetricDescription) resource.getEObject("_Nz_HctBzEeONzY86HEL4JQ");
        SCALABILITY_SPEED = (MetricSetDescription) resource.getEObject("_kx_7UdBzEeONzY86HEL4JQ");
        USER_CAPACITY = (BaseMetricDescription) resource.getEObject("_HlBOUtB0EeONzY86HEL4JQ");
        NUMBER_OF_SLO_VIOLATIONS = (BaseMetricDescription) resource.getEObject("_LJJm8tB1EeONzY86HEL4JQ");
        MEAN_TIME_TO_QUALITY_REPAIR = (BaseMetricDescription) resource.getEObject("_8m5pAtB1EeONzY86HEL4JQ");
        RESOURCE_PROVISIONING_EFFICIENCY = (BaseMetricDescription) resource.getEObject("_RjNq4tB2EeONzY86HEL4JQ");
        MARGINAL_COST = (BaseMetricDescription) resource.getEObject("_eQICYtB2EeONzY86HEL4JQ");
    }

    /** Specifies a response time metric, e.g., to store the response time of operation calls. */
    public final static BaseMetricDescription RESPONSE_TIME_METRIC;

    /** Specifies a point in time metric, e.g., to store an event time stamp. */
    public final static BaseMetricDescription POINT_IN_TIME_METRIC;

    /** Specifies a hold time metric, e.g., to store the time spend in a passive resource. */
    public final static BaseMetricDescription HOLD_TIME_METRIC;

    /** Specifies a waiting time metric, e.g., to store the waiting time at passive resource pools. */
    public final static BaseMetricDescription WAITING_TIME_METRIC;

    /** Specifies a resource demand metric, e.g., to store CPU demand measurements. */
    public final static BaseMetricDescription RESOURCE_DEMAND_METRIC;

    /** Specifies a CPU metric, e.g., to store CPU utilization at a certain time/state. */
    public final static BaseMetricDescription CPU_STATE_METRIC;

    /** Specifies a passive resource state metric. */
    public final static BaseMetricDescription PASSIVE_RESOURCE_STATE_METRIC;

    /** Specifies an execution results metric, e.g., to store simulated failure occurances. */
    public final static BaseMetricDescription EXECUTION_RESULT_METRIC;

    public final static MetricSetDescription CPU_STATE_OVER_TIME_METRIC;

    /** Scalability range without violating SLOs, e.g., the system scales up to 1,000 users. */
    public final static BaseMetricDescription SCALABILITY_RANGE;

    /** The slope for increase rates, e.g., an increase rate of 10 users/hour. */
    public final static BaseMetricDescription SLOPE;

    /** Scalability speed without violating SLOs, e.g., the system scales up to 1,000 users with increase rate 10 users/hour. */
    public final static MetricSetDescription SCALABILITY_SPEED;

    /** Maximal number of users for fixed resource without violating SLOs, e.g., a system scales up to 1,000 users for a fixed set of resources. */
    public final static BaseMetricDescription USER_CAPACITY;

    /** The number of SLO violations in a certain time frame, e.g., 42 SLO (response time) violations in 1 hour. */
    public final static BaseMetricDescription NUMBER_OF_SLO_VIOLATIONS;

    /** The mean time to stop violating SLOs, e.g., 30 seconds fir an additional 10 requests/hour. */
    public final static BaseMetricDescription MEAN_TIME_TO_QUALITY_REPAIR;

    /** Efficiency of provisioning resources, e.g., 10% more resources than actual resource demand. */
    public final static BaseMetricDescription RESOURCE_PROVISIONING_EFFICIENCY;

    /** Marginal cost for serving additional load, e.g., $1.00 for an additional 100 requests/hour. */
    public final static BaseMetricDescription MARGINAL_COST;

    private MetricDescriptionConstants() {
    }
}
