package com.example.GraalVmDemo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link GraalVmDemoApplication}.
 */
@Generated
public class GraalVmDemoApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'graalVmDemoApplication'.
   */
  public static BeanDefinition getGraalVmDemoApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GraalVmDemoApplication.class);
    beanDefinition.setTargetType(GraalVmDemoApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(GraalVmDemoApplication.class);
    beanDefinition.setInstanceSupplier(GraalVmDemoApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
