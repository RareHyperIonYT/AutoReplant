
# Auto Replant

Automatically replants harvested crops so you can harvest without ever planting again.


## Features

- **Automatic Replanting**: Instantly replant crops upon harvest.
- **Configurable Sounds**: Add sounds on crop harvest.

## Commands

| Command      | Description                    | Permission           |
|--------------|--------------------------------|----------------------|
| `/ar reload` | Reloads the configuration file | `autoreplant.reload` |

## Permissions

| Permission           | Description                     | Default |
|----------------------|---------------------------------|---------|
| `autoreplant.reload` | Allows you to reload the plugin | `op`    |

## Configuration

<details>
  <summary>config.yml</summary>

  ```yml
    reload-success: "&aSuccessfully reloaded configuration!"
    no-permission: "&cYou don't have permission to run this command."

    sound:
    enabled: true
    source: "block.note_block.bell"
    volume: 1.0
    pitch: 0.6
  ```

</details>

## Support & License

⭐ If you find this project useful, consider giving it a star on GitHub!

📜 This project is under the [MIT License](LICENSE).