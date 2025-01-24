package com.example.GraalVmDemo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Controller}.
 */
@Generated
public class Controller__BeanDefinitions {
  /**
   * Get the bean definition for 'controller'.
   */
  public static BeanDefinition getControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Controller.class);
    beanDefinition.setInstanceSupplier(Controller::new);
    return beanDefinition;
  }
}
