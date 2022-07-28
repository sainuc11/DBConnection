package sainuc11.example.DBConnection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PinDetailsRepository extends JpaRepository<PinDetails, String> {
 
	List<PinDetails> findByPinCode(String pinCode);
}