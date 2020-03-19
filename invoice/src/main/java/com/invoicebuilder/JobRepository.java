/**
 * 
 */
package com.invoicebuilder;




import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jmens
 *
 */
public interface JobRepository extends JpaRepository<Job, Long> {

}
