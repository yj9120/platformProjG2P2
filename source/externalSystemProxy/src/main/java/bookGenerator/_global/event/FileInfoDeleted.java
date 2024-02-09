package bookGenerator._global.event;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import bookGenerator._global.eventBase.EventNameAnnotation;
import bookGenerator._global.infra.AbstractEvent;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@EventNameAnnotation(eventName="FileInfoDeleted")
public class FileInfoDeleted extends AbstractEvent {
	private Long id;
	private String url;
	private Date createdDate;
	private Date updatedDate;

    public FileInfoDeleted() {
        super();
    }
}
