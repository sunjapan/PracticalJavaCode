abstract class TeamScores
{
  private Team team;

  public abstract int player1Score(int holeNumber, Team team);
  public abstract int player2Score(int holeNumber, Team team);
  public abstract void storeTeamScore(int score, Team team);
  public void processBetterBallTeamScores(Team team)
  {
    int teamScore = 0;
    for (int i=1; i<=18; i++)  //Compute team scores for each hole
    {
      int p1Score = player1Score(i, team);
      int p2Score = player2Score(i, team);
      if (p1Score < p2Score)
        teamScore = p1Score;
      else
        teamScore = p2Score;
      storeTeamScore(teamScore, team);
    }
  }
}