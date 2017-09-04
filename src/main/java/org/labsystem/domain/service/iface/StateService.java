package org.labsystem.domain.service.iface;

import java.util.List;

import org.labsystem.entity.State;

public interface StateService {
	State getState(int id);

	List<State> getAllStates();
}
