package business.abstracts;

import Entities.concretes.Game;

public interface IGameService {

	public void add(Game game);

	public void delete(Game game);

	public void update(Game game);

}
