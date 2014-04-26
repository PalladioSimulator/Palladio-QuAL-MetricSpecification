package org.palladiosimulator.metricspec.metricentity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.palladiosimulator.metricspec.MetricDescription;

public abstract class MetricEntity implements IMetricEntity {

    /** The subclasses' metric
     */
    protected final MetricDescription metricDesciption;

    /**
     * @param metricDesciption
     */
    protected MetricEntity(final MetricDescription metricDesciption) {
        super();
        if (metricDesciption == null) {
            throw new IllegalArgumentException("Metric description has to be a valid instance.");
        }

        checkValidString(metricDesciption.getName());
        checkValidString(metricDesciption.getTextualDescription());
        checkValidString(metricDesciption.getId());

        this.metricDesciption = metricDesciption;
        this.metricDesciption.eAdapters().add(new AdapterImpl() {
            @Override
            public void notifyChanged(final Notification notification) {
                if (notification.getEventType() != Notification.REMOVING_ADAPTER && notification.getEventType() != Notification.RESOLVE) {
                    //                    if (notification.getFeature() != MetricSpecFactory.eINSTANCE.getDescription_Repository()) {
                    throw new RuntimeException("Metric description altered after initializing. This is not allowed.");
                    //                    }
                }
            }
        });
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.metricentity.IMetricEntity#getMetricDesciption()
     */
    @Override
    public final MetricDescription getMetricDesciption() {
        return metricDesciption;
    }

    /* (non-Javadoc)
     * @see org.palladiosimulator.edp2.metricentity.IMetricEntity#isCompatibleWith(org.palladiosimulator.edp2.models.ExperimentData.MetricDescription)
     */
    @Override
    public final boolean isCompatibleWith(final MetricDescription other) {
        if (this.getMetricDesciption() == other || this.metricDesciption.equals(other)) {
            return true;
        }
        return false;
    }

    private void checkValidString(final String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("Parameter must not be null or empty");
        }
    }
}
