package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UnitOfMeasureCommand {
	
	private Long id;
	private String description;
	
	public UnitOfMeasureCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public UnitOfMeasureCommand(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
