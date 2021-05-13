package business.abstracts;

import Entities.concretes.Player;

public interface IPlayerService {

	public void add(Player player);

	public void delete(Player player);

	public void update(Player player);

}
